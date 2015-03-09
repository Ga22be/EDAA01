package Algorithms;

public class HeapSort {
	
	public static <E extends Comparable<E>> void sort(E[] table){
		buildHeap(table);
		shrinkHeap(table);
	}
	

	private static <E extends Comparable<E>> void buildHeap(E[] table){
		int n = 1;
		while (n < table.length){
			n++;
			int child = n-1;
			int parent = (child-1)/2;
			while (parent >= 0 && table[parent].compareTo(table[child]) < 0){
				swap(table, parent, child);
				child = parent;
				parent = (child - 1)/2;
			}
		}
	}
	
	private static <E extends Comparable<E>> void shrinkHeap(E[] table){
		int n = table.length;
		while(n > 0){
			n--;
			swap(table, 0, n);
			// Index of parent
			int parent = 0;
			// Reheap
			while(true){
				// Index of left child
				int leftChild = 2 * parent + 1;
				// If child index is out of heap bounds
				if(leftChild >= n){
					break;
				}
				// Index of right child
				int rightChild = leftChild - 1;
				// Choose which child is biggest
				int maxChild = leftChild;
				if(rightChild < n && table[leftChild].compareTo(table[rightChild]) < 0){
					maxChild = rightChild;
				}
				// If parent smaller than bigger child, switch
				if(table[parent].compareTo(table[maxChild]) < 0){
					swap(table, parent, maxChild);
					parent = maxChild;
				} else {
					break;
				}
			}
			
		}
		
	}
	
	private static <E extends Comparable<E>> void swap(E[] table, int parent, int child){
		E temp = table[parent];
		table[parent] = table[child];
		table[child] = temp;
	}
}
