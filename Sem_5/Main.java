
class Node {
	int data;
	Node left, mid, right;

	Node(int data) {
		this.data = data;
	}
}

class Main {
	public static Node push(Node node, Node head) {
		head.left = node;
		node.right = head;

		node.left = node.mid = null;

		head = node;
		return head;
	}

	public static Node ternaryTreeToDoublyLinkedList(Node root, Node head) {
		if (root == null) {
			return head;
		}

		head = ternaryTreeToDoublyLinkedList(root.right, head);
		head = ternaryTreeToDoublyLinkedList(root.mid, head);
		head = ternaryTreeToDoublyLinkedList(root.left, head);

		if (head == null) {
			head = root;
		} else {
			head = push(root, head);
		}

		return head;
	}

	public static void printDoublyLinkedList(Node node) {
		while (node != null) {
			System.out.print(node.data + " —> ");
			node = node.right;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		Node root = new Node(1);

		root.left = new Node(2);

		root.left.left = new Node(4);
		root.left.left.left = new Node(7);
		root.left.left.mid = new Node(8);
		root.left.left.right = new Node(9);

		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);

		root.right.right.left = new Node(11);
		root.right.right.right = new Node(20);

		ternaryTreeToDoublyLinkedList(root, null);
		printDoublyLinkedList(root);
	}
}