package testsort;

import java.util.Random;

import sort.RadixSort;

public class OwnRadixSortTest {

	public static void main(String[] args) {
		int[] vector = new int[1000000];
		Random rnd = new Random();
		boolean print = false;
		
//		for(int i = 0; i < 99; i++){
//			vector[i] = i+1;
//		}
		
		for(int i = 0; i < vector.length; i++){
			vector[i] = rnd.nextInt(1000001);
		}
		
		StringBuilder writer;
		
		if(print){
			writer = new StringBuilder();
			System.out.print("Vektorn: " );
			for(int i: vector){
				writer.append(i + ", ");
			}
			System.out.println(writer.toString());			
		}
		
		long startTime = System.currentTimeMillis();
		RadixSort.radixSort(vector, 7);
		long elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println(elapsedTime + " ms");
		
		if(print){
			writer = new StringBuilder();
			System.out.print("   Blev: ");
			for(int i: vector){
				writer.append(i + ", ");
			}
			System.out.println(writer.toString());			
		}

	}

}
