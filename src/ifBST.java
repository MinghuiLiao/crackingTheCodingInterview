import algorithms.TreeNode;

//Implement a function to check if a binary tree is a binary search tree
/*
 *In a binary search tree, the left child should be in (min, root],
 * the right child should be in (root, max]
 * the root should be in (min, max]
 */
public class ifBST {
	public boolean ifBST(TreeNode n) {
		return ifBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean ifBST(TreeNode n, int minValue, int maxValue) {
		if (n == null) return true;
		if (n.data < minValue || n.data >= maxValue) { //check if the root is between the minimum and maximum
			return false;
		}
		
		if (!ifBST(n.leftChild, minValue, n.data) || !ifBST(n.rightChild, n.data, maxValue)) return false; 
		// check if the left child is between the minimum and root value, then check if the right child is between the root value and maximum.
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
