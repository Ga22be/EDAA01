package test;

import bst.BSTVisualizer;
import bst.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		BSTVisualizer visualizer = new BSTVisualizer("Tree", 600, 600);
		
//		tree.add(4);
//		tree.add(2);
//		tree.add(1);
//		tree.add(3);
//		tree.add(6);
//		tree.add(5);
//		tree.add(7);
//		System.out.println(tree.add(4));
//		System.out.println(tree.add(6));
		
		for(int i = 0; i < 10; i++){
			tree.add(i);			
		}
		
		Integer a[] = new Integer[100];
		
		int b = tree.toArray(tree.getRoot(), a, 50);

		for(Integer c : a){
			System.out.println(c);
		}
		
		System.out.println(b);
		
		System.out.println(tree.size());
		
		visualizer.drawTree(tree);
		
		System.out.println(tree.height());
		
		tree.printTree();
	}


}
