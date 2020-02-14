package StackDataStructure;

class StackList {

	static Node head;
	static Node tail;
	int size = 0;

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			data = d;
		}
	}

	void push(int d) {
		if (tail == null) {
			Node n = new Node(d);
			head = n;
			tail = n;
			size++;
		} else {
			Node n = new Node(d);
			tail.next = n;
			n.prev = tail;
			tail = n;
			size++;
		}
	}

	int pop() {
		try {
			if (head == null) {
				throw new Exception();
			} else if (head.next == null) {
				int val = head.data;
				head = null;
				tail = null;
				size--;
				return val;
			} else {
				int val = tail.data;
				tail = tail.prev;
				tail.next = null;
				size--;
				return val;
			}
		} catch (Exception e) {
			System.out.print("Underflow ");
			return -1;
		}
	}

	int peek() {
		try {
			if (tail == null) {
				throw new Exception();
			} else {
				return tail.data;
			}
		} catch (Exception e) {
			System.out.print("Stack is Empty ");
			return -1;
		}
	}

	boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	boolean contains(int d) {
		if (isEmpty()) {
			System.out.print("Stack is Empty ");
			return false;
		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.data == d) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}
	}

	public String toString() {
		String str = "[";
		Node temp = head;
		while (temp != null) {
			if (temp.next == null) {
				str += temp.data;
			} else {
				str += temp.data + ", ";
			}
			temp = temp.next;
		}
		str += "]";
		return str;
	}

}

public class StackLL {
	public static void main(String[] args) {
		StackList stk = new StackList();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		stk.push(1);
		stk.push(2);
		stk.push(3);
		System.out.println(stk);
		stk.clear();
		System.out.println(stk.isEmpty());
		System.out.println(stk);
		stk.push(1);
		stk.push(2);
		stk.push(3);
		System.out.println(stk.contains(2));
		System.out.println(stk);
	}
}