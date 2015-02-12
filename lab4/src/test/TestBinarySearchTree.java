package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bst.BinarySearchTree;

public class TestBinarySearchTree {
	private BinarySearchTree<Integer> myIntBST;
	private BinarySearchTree<String> myStringBST;

	@Before
	public void setUp() throws Exception {
		myIntBST = new BinarySearchTree<Integer>();
		myStringBST = new BinarySearchTree<String>();
	}

	@After
	public void tearDown() throws Exception {
		myIntBST = null;
		myStringBST = null;
	}

	/**
	 * Test if a newly created tree is empty.
	 */
	@Test
	public final void TestNewBST() {
		assertEquals("Size should be 0", 0, myIntBST.size());
		assertEquals("Height should be 0", 0, myIntBST.height());
	}

	/**
	 * Test if possible to add object to empty list.
	 */
	@Test
	public final void TestEmptyAdd() {
		assertTrue("Add should be able to insert value into tree",
				myIntBST.add(1));
		assertTrue("Add should be able to insert value into tree",
				myStringBST.add("a"));
	}

	/**
	 * Test if possible to add duplicate.
	 */
	@Test
	public final void TestDuplicateAdd() {
		myIntBST.add(1);
		myStringBST.add("a");
		assertFalse("Add should'nt be able to insert duplicate into tree",
				myIntBST.add(1));
		assertFalse("Add should'nt be able to insert duplicate into tree",
				myStringBST.add("a"));
	}

	@Test
	public final void TestRebuild() {
		for (int i = 0; i < 15; i++) {
			myIntBST.add(i);
		}
		assertEquals("Height should be 15", 15, myIntBST.height());
		myIntBST.rebuild();
		assertEquals("Height should be 4", 4, myIntBST.height());
	}

	/**
	 * Prints the created tree
	 */
	@Test
	public final void TestPrintTree() {
		for (int i = 0; i < 15; i++) {
			myIntBST.add(i);
		}

		myIntBST.printTree();
		System.out.println();
		
		myIntBST.rebuild();
		
		myIntBST.printTree();
		System.out.println(); 
	}
	
	/**
	 * Prints the created tree
	 */
	@Test
	public final void TestAddManyStrings() {
		Random rand = new Random();
		for (int i = 0; i < 26; i++) {
			char c = 97;
			
			myStringBST.add(Character.toString((char) (c+rand.nextInt(26))));
		}

		myStringBST.printTree();
		System.out.println();
		
		myStringBST.rebuild();
		
		myStringBST.printTree();
		System.out.println(); 
	}

}
