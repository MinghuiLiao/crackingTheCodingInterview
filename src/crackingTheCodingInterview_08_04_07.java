import algorithms.TreeNode;

//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree.
//Avoid storing additional nodes in a data structure.


public class crackingTheCodingInterview_08_04_07 {
	
	
	result findFirstCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) return new result(null, false);
		if (root == p && root == q) return new result(root, true);
		
		result rl = findFirstCommonAncestor(root.leftChild, p, q);
		if (rl.isAncestor) return rl;
		
		result rr = findFirstCommonAncestor(root.rightChild, p, q);
		if (rr.isAncestor) return rr;
		
		if (rl.node != null && rr.node != null) {
			return new result(root, true);
		} else if (root == p || root == q) {
			boolean isAncestor = rl.node != null || rr.node != null ? true: false;
			return new result(root, isAncestor);
		} else {
			return new result(rl.node != null ? rl.node : rr.node, false);
		}
	}
	
	TreeNode findCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		result r = findFirstCommonAncestor(root, p, q);
		if (r.isAncestor) {
			return r.node;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class result {
	public TreeNode node;
	public boolean isAncestor;
	public result(TreeNode n, boolean isAnc) {
		node = n;
		isAncestor = isAnc;
	}
}