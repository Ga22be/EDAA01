package Algorithms;

public class MergeSort {
	public static <E extends Comparable<E>> void sort(E[] table) {
		if (table.length > 1) {
			int halfSize = table.length / 2;
			E[] leftTable = (E[]) new Comparable[halfSize];
			E[] rightTable = (E[]) new Comparable[table.length - halfSize];
			System.arraycopy(table, 0, leftTable, 0, halfSize);
			System.arraycopy(table, halfSize, rightTable, 0, table.length
					- halfSize);
			sort(leftTable);
			sort(rightTable);
			merge(table, leftTable, rightTable);
		}
	}
	
	public static <E extends Comparable<E>> void merge(E[] output, E[] left, E[] right){
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i].compareTo(right[j]) < 0) {
				output[k++] = left[i++];
			} else {
				output[k++] = right[j++];
			}
		}
		
		while(left.length > i){
			output[k++] = left[i++];
		}
		
		while(right.length > j){
			output[k++] = right[j++];
		}
		
	}
}
