package test;

import java.util.Random;

import map.SimpleHashMap;

public class OwnTestSimpleHashMap {
	public static void main(String[] args) {
		Random rnd = new Random();
		SimpleHashMap<Integer, String> map = new SimpleHashMap<Integer,String>(10);
		System.out.println(map.show());
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		for(int i = 0; i < 9; i++){
			Integer temp = rnd.nextInt();
			map.put(temp, temp.toString());
		}
		
//		map.put("B", "Benny");
//		map.put("C", "Carl");
//		map.put("D", "David");
		
		System.out.println(map.show());
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println();
		
//		System.out.println("B: " + map.get("B"));
//		System.out.println("Kommer jag hit?");
//		System.out.println("C: " + map.get("C"));
//		System.out.println("Kommer jag hit?");
//		System.out.println("D: " + map.get("D"));
		
		
		
	}
}
