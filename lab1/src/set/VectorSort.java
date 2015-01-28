package set;

import java.util.Collections;
import java.util.Iterator;

public class VectorSort{	
	public static void main(String[] args){
		int[] ints = new int[]{3,6,3,7,2,9,4,6,7,6,5,4,6,5,6,8};
		
		int[] sorted  = uniqueElements(ints);
		
		for(int i : sorted){
			System.out.print(i + ", ");
		}		
	}
	
	public static int[] uniqueElements(int[] ints){
		MaxSet<Integer> set = new MaxSet<Integer>();

		for(int i : ints){
			set.add(i);
		}
		
		int[] out = new int[set.size()];
		
		for(int i = set.size()-1; i >= 0; i--){
			out[i] = set.getMax();
			set.remove(out[i]);
		}
		
		return out;
	}
}
