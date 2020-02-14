package StackDataStructure;

public class StackImplementation {
	private int len = 10;
	private int arr[] = new int[len];
	private int top = -1;
	
	void push(int d) {
		if(top == len-1) {
			len = 2*len;
			int brr[] = new int[len];
			for(int i=0;i<=top;i++) {
				brr[i] = arr[i];
			}
			top++;
			arr = brr;
			arr[top] = d;
			return;
		}
		top++;
		arr[top] = d;
	}
	
	int peek() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[top];
	}

	int pop() {
		if(top == -1) {
			System.out.println("Underflow");
			return -1;
		}
		else {
			int val = arr[top];
			top--;
			return val;
		}
	}
	
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackImplementation s = new StackImplementation();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
		System.out.println("Peek "+ s.peek());
		System.out.println("Pop "+s.pop());
		s.display();
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		s.push(110);
		s.display();
		
	}

}
