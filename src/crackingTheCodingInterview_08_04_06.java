import algorithms.TreeNode;

//Write an algorithm to find the 'next' node(i.e., in-order successor) of a given node in a binary search tree. 
//* You may assume that each node has a link to its parent.
public class crackingTheCodingInterview_08_04_06 {
	public TreeNode inOrderSuccessor(TreeNode n) {
		if (n == null) return null;
		
		if (n.rightChild != null) {
			return TraversalLeft(n.rightChild); //find the far left of the right children tree
		} else {
			TreeNode p = n;
			TreeNode q = p.parent;
			while (q != null && q.leftChild != p) {
				p = q;
				q = q.parent;
			}
			return q;
		}
	}

	public TreeNode TraversalLeft(TreeNode n) {
		if (n == null) return null;
		while (n.leftChild != null) {
			n = n.leftChild;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
