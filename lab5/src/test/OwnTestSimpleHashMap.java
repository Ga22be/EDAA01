package test;

import java.util.Random;

import map.SimpleHashMap;

public class OwnTestSimpleHashMap {
	public static void main(String[] args) {
		Random rnd = new Random();
		SimpleHashMap<Integer, Integer> map = new SimpleHashMap<Integer, Integer>(10);
		System.out.println(map.show());
		System.out.println(map.size());
		System.out.println(map.isEmpty());

		for (int i = 0; i < 3000; i++) {
			Integer temp = rnd.nextInt();
			map.put(temp, temp);
		}

		System.out.println(map.show());
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println();

	}
}
