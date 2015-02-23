package test;

import map.SimpleHashMap;

public class OwnTestSimpleHashMap {
	public static void main(String[] args) {
		SimpleHashMap<Integer, String> map = new SimpleHashMap<>();
		System.out.println(map.show());
		int i = map.index(9);
		System.out.println(i);
		
		System.out.println(map.find(i, 9).toString());
	}
}
