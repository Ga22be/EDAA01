package Testing;

import java.util.ArrayList;
import java.util.Random;

import Algorithms.*;

public class TestSort {

	public static void main(String[] args) {
		int n = 1000000;
		Integer[] list = new Integer[n];
		Random rnd = new Random();

		for (int i = 0; i < list.length; i++) {
			list[i] = rnd.nextInt(n);
		}

		// Merge sort
		Integer[] tempList = list.clone();
		long startTime = System.currentTimeMillis();
		MergeSort.sort(tempList);
		long computationTime = System.currentTimeMillis() - startTime;
		System.out.println("MergeSort = " + computationTime + "ms");
		if (n <= 100)
			print(tempList);
		System.out.println();

		// Heap sort
		tempList = list.clone();
		startTime = System.currentTimeMillis();
		HeapSort.sort(tempList);
		computationTime = System.currentTimeMillis() - startTime;
		System.out.println("HeapSort = " + computationTime + "ms");
		if (n <= 100)
			print(tempList);
		System.out.println();
		
		// Quick sort
		tempList = list.clone();
		startTime = System.currentTimeMillis();
		QuickSort.sort(tempList);
		computationTime = System.currentTimeMillis() - startTime;
		System.out.println("QuickSort = " + computationTime + "ms");
		if (n <= 100)
			print(tempList);
		System.out.println();

		// Selection sort
		tempList = list.clone();
		startTime = System.currentTimeMillis();
		SelectionSort.sort(tempList);
		computationTime = System.currentTimeMillis() - startTime;
		System.out.println("SelectionSort = " + computationTime + "ms");
		if (n <= 100)
			print(tempList);
		System.out.println();

		// Insertion sort
		tempList = list.clone();
		startTime = System.currentTimeMillis();
		InsertionSort.sort(tempList);
		computationTime = System.currentTimeMillis() - startTime;
		System.out.println("InsertionSort = " + computationTime + "ms");
		if (n <= 100)
			print(tempList);
		System.out.println();

	}

	private static <E> void print(E[] list) {
		System.out.print("[");
		for (E i : list) {
			System.out.print(i + ", ");
		}
		System.out.println("]");
	}

}
