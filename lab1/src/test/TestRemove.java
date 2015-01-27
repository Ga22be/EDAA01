package test;

import set.MaxSet;

public class TestRemove {

	public static void main(String[] args) {
		MaxSet<Integer> s = new MaxSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			s.add(i);
		}
		
		for (int i = 10; i >= 5; i--) {
			s.remove(i);
		}

	}

}
