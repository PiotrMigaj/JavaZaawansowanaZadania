package pl.migibud.workbook.codewars.ex16;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		String high = high("man i need a taxi up to ubud");

		System.out.println(high);

//		System.out.println(high);
//
//		String test = "abba";
//
////		Arrays.stream(test.split(""))
////				.map(v->v.cha)
//
//		"abba".chars().map(i->i-96).forEach(System.out::println);
//
//		Map<String,Integer> map = new HashMap<>();
//		map.put("Piotr",29);
//
//		System.out.println(map);
//
//		Integer piotr = map.put("Piotr", 30);
//
//		System.out.println(map);
//		System.out.println(piotr);

		String input = "aaa bbb ccc abc";

//		List<Integer> collect = Arrays.stream(input.split(" "))
//				.map(v -> v.chars().map(i -> i - 96).sum())
//				.collect(Collectors.toList());
//
//		System.out.println(collect);
//
//		Map<Integer,String> map1 = new TreeMap<>(Comparator.reverseOrder());
//
//		System.out.println(collect.size());
//
//		IntStream.range(0,collect.size()).forEach(i->map1.putIfAbsent(collect.get(i),input.split(" ")[i]));
//
//		String first = map1.values().stream()
//				.findFirst().get();
//
//		System.out.println(map1);

	}

	public static String high(String s) {

		List<Integer> collect = Arrays.stream(s.split(" "))
				.map(v -> v.chars().map(i -> i - 96).sum())
				.collect(Collectors.toList());

		Map<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());

		IntStream.range(0,collect.size()).forEach(i->map.putIfAbsent(collect.get(i),s.split(" ")[i]));


		return map.values().stream()
				.findFirst()
				.get();
	}

}


