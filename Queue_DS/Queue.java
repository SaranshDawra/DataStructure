public class Queue {

	static int maxSize = 10;
	static int arr[];
	static int front;
	static int rear;

	Queue() {
		arr = new int[maxSize];
		front = -1;
		rear = -1;
	}

	void enqueue(int d) {
		rear++;
		if(front == -1) {
			front++;
		}
		if (front == maxSize) {
			System.out.println("Overflow");
			return;
		}
		arr[rear] = d;
	}

	void dequeue() {
		if (front == -1) {
			System.out.println("Underflow");
		} else if (front == rear) {
			System.out.println(arr[front]);
			front = -1;
			rear = -1;
		} else {
			System.out.println(arr[front]);
			front++;
		}
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public String toString() {
		if(front == -1 && rear == -1) {
			return "[]";
		}
		String str = "[";
		for(int i=front;i<=rear;i++) {
			if(i == rear) {
				str+=""+arr[i]+"]";
			}
			else {
				str+=""+arr[i]+",";
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q);
	}

}