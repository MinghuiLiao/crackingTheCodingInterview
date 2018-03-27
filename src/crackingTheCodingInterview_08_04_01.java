//Implement a function to check if a tree is balanced.
public class crackingTheCodingInterview_08_04_01 {
	private class TreeNode {
		private int key = 0;
		private String data = null;
		private boolean isVisited = false;
		private TreeNode leftChild = null;
		private TreeNode rightChild = null;
		
		public TreeNode() {}
		public TreeNode(int key, String data) {
			this.key = key;
			this.data = data;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
	}
	
	public class BinaryTree {
		private TreeNode root = null;
		public BinaryTree() {
			root = new TreeNode(1, "rootNode(a)");
		}
		
		/** 
	     * create a binary tree
	     * <pre> 
	     *           A 
	     *     B          C 
	     *  D     E            F 
	     *  </pre> 
	     * @param root 
	     */  	
		public void createBinaryTree(TreeNode root) {
			TreeNode newNodeB = new TreeNode(2, "B");
			TreeNode newNodeC = new TreeNode(3, "C");
			TreeNode newNodeD = new TreeNode(4, "D");
			TreeNode newNodeE = new TreeNode(5, "E");
			TreeNode newNodeF = new TreeNode(6, "F");
			root.leftChild = newNodeB;
			root.rightChild = newNodeC;
			root.leftChild.leftChild = newNodeD;
			root.leftChild.rightChild = newNodeE;
			root.rightChild.rightChild = newNodeF;			
		}
		
		public boolean isEmpty() {
			return root == null;
		}
		
		public int height(TreeNode subTree) {
			if(subTree == null) {
				return 0;
			} else {
				int i = height(subTree.leftChild);
				int j = height(subTree.rightChild);
				return (i < j) ? (j + 1) : (i + 1);
			}	
		}
		
		public boolean isBalanced(TreeNode root) {
			if (root == null) return true;
			int heightDifference = height(root.leftChild) - height(root.rightChild);
			
			if (Math.abs(heightDifference) > 1) {
				return false;
			} else {
				return isBalanced(root.leftChild) && isBalanced(root.rightChild);
			}
		}
		
		public int height() {
			return height(root);
		}
		
		public int size(TreeNode subTree) {
			if (subTree == null) {
				return 0;
			} else {
				return 1 + size(subTree.leftChild) + size(subTree.rightChild);
			}
		}
		
		public int size() {
			return size(root);
		}
		
		public TreeNode parent(TreeNode subTree, TreeNode element) {
			if (subTree == null) return null;
			if (subTree.leftChild == element || subTree.rightChild == element) return subTree;
			
			TreeNode p;
			if ((p = parent(subTree.leftChild, element)) != null) {
				return p;
			} else {
				return parent(subTree.rightChild, element);
			}
		}
		
		public TreeNode getLeftChildNode(TreeNode element) {
			return (element != null) ? element.leftChild: null;
		}
		
		public TreeNode getRightChildNode(TreeNode element) {
			return (element != null) ? element.rightChild: null;
		}
		
		public TreeNode getRoot() {
			return root;
		}
	}
	
	BinaryTree newBinaryTree() {
		BinaryTree bt = new BinaryTree();
		return bt;
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_04_01 a = new crackingTheCodingInterview_08_04_01();
		BinaryTree bt = a.newBinaryTree();
		bt.createBinaryTree(bt.root);
		System.out.println("The height of the tree is " + bt.height());
		if (bt.isBalanced(bt.root)) {
			System.out.println("The binary tree is balanced. ");
		} else {
			System.out.println("This binary tree is not balanced. ");
		}
	}

}
