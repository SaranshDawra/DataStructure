public class BST {

	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
		}
	}

	void insertNode(int d) {
		root = insert(root, d);
	}

	Node insert(Node root, int d) {

		if (root == null) {
			Node n = new Node(d);
			return n;
		}
		if (root.data > d) {
			root.left = insert(root.left, d);
		} else if (root.data < d) {
			root.right = insert(root.right, d);
		}
		return root;
	}

	void preOrder() {
		preOrder(root);
	}

	void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder() {
		inOrder(root);
	}

	void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	void postOrder() {
		postOrder(root);
	}

	void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	int minimumValue() {
		return minimumValue(root);
	}
	
	int minimumValue(Node root) {
		if(root.left == null) {
			return root.data;
		}
		
		return minimumValue(root.left);
		
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insertNode(70);
		tree.insertNode(60);
		tree.insertNode(50);
		tree.insertNode(40);
		tree.insertNode(30);
		tree.insertNode(20);
		tree.insertNode(10);
		System.out.println("<-----PreOrder----->");
		tree.preOrder();
		System.out.println("<---------->");
		System.out.println("<-----InOrder----->");
		tree.inOrder();
		System.out.println("<---------->");
		System.out.println("<-----PostOrder----->");
		tree.postOrder();
		System.out.println("<---------->");
		System.out.println("Minimum value: "+tree.minimumValue());
	}

}
