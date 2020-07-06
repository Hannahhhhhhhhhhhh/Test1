package sort;

public class Tree {
	
	public class Node{
		
		int value ;
		Node left ;
		Node right ;
		
		public Node(int value) {
			this.value = value;
		}
		
		public void add(Node node) {

			if (node.value < this.value) {
				if(this.left == null) {
					this.left = node;
				}
				else {
					this.left.add(node);
				}
			}
			else if (node.value >= this.value) {
				if(this.right == null) {
					this.right = node;
				}
				else {
					this.right.add(node);
				}
			}
		}
		
		public void NodePreOut(Node node) {
			if(node == null) {
				return;
			}
			else {
				NodePreOut(node.left);
				System.out.print(node.value);
				NodePreOut(node.right);
			}
		}
	}
	
	
	Node root = null;
	
	public void add(Node node) {
		if (root == null) {
			root = node;
		}
		else {
			root.add(node);
		}
	}
	
	public void preOut() {
		if(root == null) {
			System.out.println("Null tree");
		}
		else {
			root.NodePreOut(root);
		}
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		int[] arr = {3,4,2,5,8,1,9};
		for (int i: arr) {
			System.out.print(i);
			tree.add(tree.new Node(i));
		}
		System.out.println();
		tree.preOut();

	}

}
