package com.lastcourse.exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicate implements java.util.function.Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		System.out.println(i);
		return i == 10;
	}

	public static void main(String[] args) {

//		Predicate p = new Predicate();
//
//		List<Integer> integer1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		List<Integer> integer2 = integer1.stream().filter(p).collect(Collectors.toList());
//
//		for (Integer i : integer2) {
//			System.out.println(i);
//		}
//
//		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
//
//		Stream<String> stream2 = stream.filter(str -> Character.isUpperCase(str.charAt(1)));
//		
//		Iterator<String> it = stream2.iterator();
//		
//		System.out.println("Iterator start");
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		System.out.println("Iterator end");
		
		MyEnum m = MyEnum.HIGH;
		
		System.out.println(m.getLevelCode());
		
		

	}

	
	
enum MyEnum{
	
	LOW,
	MEDIUM,
	HIGH;
		
	private int j;
	
	public int getLevelCode() {
		return this.j;
	}
	
	
}	
	
	
}
