package algorithms;

public class TreeNode<T> {
	  private T item;
	  public TreeNode<T> leftChild;
	  public TreeNode<T> rightChild;
	  public int data;
      public TreeNode parent;
	  
	  public TreeNode (int d) {
		  data = d;
	  }

	  public TreeNode(T newItem) {
	  // Initializes tree node with item and no children.
	    item = newItem;
	    leftChild  = null;
	    rightChild = null;
	  }  // end constructor
	    
	  public TreeNode(T newItem, 
	                  TreeNode<T> left, TreeNode<T> right) {
	  // Initializes tree node with item and
	  // the left and right children references.
	    item = newItem;
	    leftChild  = left;
	    rightChild = right;
	  }  // end constructor

	  public T getItem() {
	  // Returns the item field.
	    return item;
	  }  // end getItem

	  public void setItem(T newItem) {
	  // Sets the item field to the new value newItem.
	    item  = newItem;
	  }  // end setItem

	  public TreeNode<T> getLeft() {
	  // Returns the reference to the left child.
	    return leftChild;
	  }  // end getLeft

	  public void setLeft(TreeNode<T> left) {
	  // Sets the left child reference to left.
	    leftChild  = left;
	  }  // end setLeft

	  public TreeNode<T> getRight() {
	  // Returns the reference to the right child.
	    return rightChild;
	  }  // end getRight

	  public void setRight(TreeNode<T> right) {
	  // Sets the right child reference to right.
	    rightChild  = right;
	  }  // end setRight
	}  // end TreeNode