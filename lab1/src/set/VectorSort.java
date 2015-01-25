package set;

import java.util.ArrayList;
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
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i : ints){
			list.add(i);
		}
		
		Collections.sort(list);
		
		Iterator listItr = list.iterator();
		while(listItr.hasNext()){			
			set.add((Integer) listItr.next());
		}
		
		int[] temp = new int[set.size()];
		int i = 0;
		
		Iterator setItr = set.iterator();
		while(setItr.hasNext()){
			temp[i++] = (Integer) setItr.next();
		}
		return temp;
	}
}
