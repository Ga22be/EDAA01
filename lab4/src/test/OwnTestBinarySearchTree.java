package test;

import java.util.Random;

import bst.BSTVisualizer;
import bst.BinarySearchTree;

public class OwnTestBinarySearchTree {

	public static void main(String[] args) {
		Random rnd = new Random();
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
		
		for(int i = 0; i < 15; i++){
			tree.add(rnd.nextInt(63));			
		}
		
//		Integer a[] = new Integer[tree.size()];
//		
//		int b = tree.toArray(tree.getRoot(), a, 0);
//
//		for(Integer c : a){
//			System.out.println(c);
//		}
		
//		System.out.println(b);
		
//		System.out.println(tree.size());
		
		visualizer.drawTree(tree);
		
		System.out.println(tree.height());
//		long startTime = System.currentTimeMillis();
//		tree.printTree();
//		System.out.println();
//		long elapsedTime = System.currentTimeMillis() - startTime;
//		System.out.println(elapsedTime + " ms");
		
		tree.rebuild();
		
//		startTime = System.currentTimeMillis();
//		tree.printTree();
//		System.out.println();
//		elapsedTime = System.currentTimeMillis() - startTime;
//		System.out.println(elapsedTime + " ms");
		System.out.println(tree.height());
		
		
		
		visualizer.drawTree(tree);
	}


}
