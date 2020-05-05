public class MaxHeap {

	private int Heap[];
	private int size;
	private int maxSize;

	MaxHeap() {
		this.maxSize = 10;
		this.size = 0;
		Heap = new int[11];
		Heap[0] = Integer.MAX_VALUE;
	}

	MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		Heap = new int[maxSize + 1];
		Heap[0] = Integer.MAX_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private void swap(int currentPos, int parentPos) {
		int temp = Heap[currentPos];
		Heap[currentPos] = Heap[parentPos];
		Heap[parentPos] = temp;
	}

	public void insert(int val) {
		Heap[++size] = val;
		int current = size;
		while (Heap[current] > Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	public boolean remove(int val) {
		for(int i=1;i<=size;i++) {
			if(Heap[i] == val && i == size) {
				size--;
				return true;
			} else if(Heap[i] == val) {
				Heap[i] = Heap[size];
				Heap[size--] = 0;
				maxHeapify(i);
				return true;
			}
		}
		return false;
	}

	private int leftChild(int pos) {
		return 2 * pos;
	}

	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	private boolean isLeaf(int pos) {
		if (pos >= size / 2 && pos <= size) {
			return true;
		}
		return false;
	}

	private void maxHeapify(int pos) {
		if (isLeaf(pos)) {
			return;
		}

		int l = leftChild(pos);
		int r = rightChild(pos);

		if (Heap[pos] < Heap[l] || Heap[pos] < Heap[r]) {
			if (Heap[l] > Heap[r]) {
				swap(pos, l);
				maxHeapify(l);
			} else {
				swap(pos, r);
				maxHeapify(r);
			}
		}
	}

	public int max() {
		int popped = Heap[1];
		Heap[1] = Heap[size--];
		maxHeapify(1);
		return popped;
	}

	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out
					.print("PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap();
		heap.insert(5);
		heap.insert(3);
		heap.insert(17);
		heap.insert(10);
		heap.insert(84);
		heap.insert(19);
		heap.insert(6);
		heap.insert(22);
		heap.insert(9);

		heap.print();
	}

}
