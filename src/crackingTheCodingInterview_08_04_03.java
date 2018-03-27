import algorithms.TreeNode;

//Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
public class crackingTheCodingInterview_08_04_03 {
	TreeNode createMinimalBST(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.leftChild = createMinimalBST(arr, start, mid - 1);
		n.rightChild = createMinimalBST(arr, mid + 1, end);		
		return n;
	}

	TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
