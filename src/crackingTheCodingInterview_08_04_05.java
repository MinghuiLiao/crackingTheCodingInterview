import algorithms.TreeNode;
//Implement an algorithm to find if the tree is Binary Search Tree.
public class crackingTheCodingInterview_08_04_05 {
	public boolean checkIfIsBST(TreeNode root) {
		return checkIfIsBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	public boolean checkIfIsBST(TreeNode root, int max, int min) {
		if (root == null) return false;
		if (root.data < min || root.data >= max) return false;
		if (!checkIfIsBST(root.leftChild, root.data, min) || !checkIfIsBST(root.rightChild, max, root.data)) return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
