public class AVLTree {

	private class Node {
		int data;
		Node left;
		Node right;
		int height;

		Node(int data) {
			this.data = data;
			this.height = 1;
		}
	}

	private Node root;

	public void insert(int item) {
		this.root = insert(this.root, item);
	}

	private Node insert(Node root, int item) {

		if (root == null) {
			Node n = new Node(item);
			return n;
		}

		if (item > root.data) {
			root.right = insert(root.right, item);
		} else if (item < root.data) {
			root.left = insert(root.left, item);
		}

		root.height = Math.max(height(root.left), height(root.right)) + 1;
		int bf = bf(root);

		// LL
		if (bf > 1 && item < root.left.data) {
			return rightRotate(root);
		}

		// RR
		if (bf < -1 && item > root.right.data) {
			return leftRotate(root);
		}

		// LR
		if (bf > 1 && item > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// RL
		if (bf < -1 && item < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		}

		return root.height;
	}

	private int bf(Node root) {
		if (root == null) {
			return 0;
		}

		return height(root.left) - height(root.right);
	}

	private Node rightRotate(Node c) {
		Node b = c.left;
		Node T3 = b.right;

		// Rotate
		b.right = c;
		c.left = T3;

		// Height Update
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		b.height = Math.max(height(b.left), height(b.right)) + 1;

		return b;
	}

	private Node leftRotate(Node c) {
		Node b = c.right;
		Node T2 = b.left;

		// Rotate
		b.left = c;
		c.right = T2;

		// Height Update
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		b.height = Math.max(height(b.left), height(b.right)) + 1;

		return b;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node root) {
		if (root == null) {
			return;
		}
		String str = "";
		if (root.left == null) {
			str += ".";
		} else {
			str += root.left.data;
		}

		str += " => " + root.data + " <= ";

		if (root.right == null) {
			str += ".";
		} else {
			str += root.right.data;
		}

		System.out.println(str);

		display(root.left);
		display(root.right);

	}

}
