package Algorithms;

public class QuickSort {
	public static <E extends Comparable<E>> void sort(E[] table) {
		quickSort(table, 0, table.length - 1);
	}

	private static <E extends Comparable<E>> void quickSort(E[] table,
			int first, int last) {
		if (first < last) {
			int pivIndex = partition(table, first, last);
			quickSort(table, first, pivIndex - 1);
			quickSort(table, pivIndex + 1, last);
		}
	}

	private static <E extends Comparable<E>> int partition(E[] table,
			int first, int last) {
		BubbleSort3(table, first, last);
		swap(table, first, (first+last)/2);
		E pivot = table[first];
		int up = first;
		int down = last;
		do {
			while (up < last && pivot.compareTo(table[up]) >= 0) {
				up++;
			}
			while (pivot.compareTo(table[down]) < 0) {
				down--;
			}
			if(up < down){
				swap(table, up, down);
			}
		} while (up < down);
		
		swap(table, first, down);
		return down;
	}

	private static <E extends Comparable<E>> void swap(E[] table, int first,
			int second) {
		E temp = table[first];
		table[first] = table[second];
		table[second] = temp;
	}
	
	private static <E extends Comparable<E>> void BubbleSort3(E[] table, int first, int last){
		int middle = (first+last)/2;
		if(table[middle].compareTo(table[first]) < 0){
			swap(table, middle, first);
		}
		if(table[last].compareTo(table[middle]) < 0){
			swap(table, last, middle);
		}
		if(table[middle].compareTo(table[first]) < 0){
			swap(table, first, middle);
		}
	}
}
