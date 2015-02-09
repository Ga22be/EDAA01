package bst;

public class BinarySearchTree<E extends Comparable<? super E>> {
	BinaryNode<E> root;
    int size;
    
	/**
	 * Constructs an empty binary searchtree.
	 */
	public BinarySearchTree() {
		size = 0;
		root = null;
	}

	/**
	 * Inserts the specified element in the tree if no duplicate exists.
	 * @param x element to be inserted
	 * @return true if the the element was inserted
	 */
	public boolean add(E x) {
		return false;
	}
	
	/**
	 * Computes the height of tree.
	 * @return the height of the tree
	 */
	public int height() {
		BinaryNode<E> temp = root;
		
		return 0;
	}
	
	private int height(BinaryNode<E> n){
		int left = 0;
		int right = 0;
		if(n.left == null && n.right == null){
			return 0;
		} else if (n.left != null && n.right != null){
			left = 1 + height(n.left);
			right = 1 + height(n.right);
			if(left >= right){
				return left;
			}
			return right;
		} else if (n.left != null){
			left = 1 + height(n.left);
			return left;
		}
		right = 1 + height(n.right);
		return right;	
	}
	
	/**
	 * Returns the number of elements in this tree.
	 * @return the number of elements in this tree
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * Print tree contents in inorder.
	 */
	public void printTree() {

	}

	/** 
	 * Builds a complete tree from the elements in the tree.
	 */
	public void rebuild() {

	}
	
	/**
	 * Adds all elements from the tree rooted at n in inorder to the array a
	 * starting at a[index].
	 * Returns the index of the last inserted element + 1 (the first empty
	 * position in a).
	 */
	private int toArray(BinaryNode<E> n, E[] a, int index) {
		return 0;
	}
	
	/**
	 * Builds a complete tree from the elements a[first]..a[last].
	 * Elements in the array a are assumed to be in ascending order.
	 * Returns the root of tree.
	 */
	private BinaryNode<E> buildTree(E[] a, int first, int last) {
		return null;
	}
	


	static class BinaryNode<E> {
		E element;
		BinaryNode<E> left;
		BinaryNode<E> right;

		private BinaryNode(E element) {
			this.element = element;
		}	
	}
	
}
