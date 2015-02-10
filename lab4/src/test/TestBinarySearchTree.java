package test;

import bst.BSTVisualizer;
import bst.BinarySearchTree;

import com.sun.javafx.fxml.expression.BinaryExpression;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		BSTVisualizer visualizer = new BSTVisualizer("Tree", 600, 600);
		
		tree.add(4);
//		tree.add(2);
//		tree.add(1);
//		tree.add(3);
		
		visualizer.drawTree(tree);
		
		System.out.println(tree.height());
		
		tree.printTree();
	}


}
