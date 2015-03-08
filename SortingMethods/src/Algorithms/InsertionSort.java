package Algorithms;

import java.util.ArrayList;

public class InsertionSort {
	public static <E extends Comparable<E>> void sort(E[] table) {
		for(int i = 1; i < table.length; i++) {
			int nextPos = i;
			E nextVal = table[nextPos];
			while (nextPos > 0 && nextVal.compareTo(table[nextPos - 1]) < 0) {
				table[nextPos] = table[nextPos-1];
				nextPos--;
			}
			table[nextPos] = nextVal;
		}
	}
}