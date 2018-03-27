import java.util.ArrayList;
import java.util.LinkedList;
import algorithms.TreeNode;

//Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth 
//(i.e., if you have a tree with depth D, you'll have D linked lists)
public class crackingTheCodingInterview_08_04_04 {	
	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if (root != null) {
			current.add(root);
		}
		
		while (current.size() > 0) {
			result.add(current);
			LinkedList<TreeNode> parents = current; //turn to next layer
			current = new LinkedList<TreeNode>();
			for (TreeNode parent: parents) {
				if (parent.leftChild != null) {
					current.add(parent.leftChild);
				}
				if (parent.rightChild != null) {
					current.add(parent.rightChild);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
