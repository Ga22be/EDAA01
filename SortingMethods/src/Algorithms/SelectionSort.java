package Algorithms;

import java.util.ArrayList;

public class SelectionSort {
	public static void sort(Comparable[] table){
		for(int fill = 0; fill < table.length - 1; fill++){
			int minIndex = fill;
			for(int next = fill + 1; next < table.length; next++){
				if(table[next].compareTo(table[minIndex]) < 0){
					minIndex = next;
				}
			}
			Comparable temp = table[fill];
			table[fill] = table[minIndex];
			table[minIndex] = temp;
		}
	}
}