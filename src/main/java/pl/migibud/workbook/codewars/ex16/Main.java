package pl.migibud.workbook.codewars.ex16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		String high = high("man i need a taxi up to ubud");
		System.out.println(high);

		String test = "abba";

//		Arrays.stream(test.split(""))
//				.map(v->v.cha)

		"abba".chars().map(i->i-96).forEach(System.out::println);

		Map<String,Integer> map = new HashMap<>();
		map.put("Piotr",29);

		System.out.println(map);

		Integer piotr = map.put("Piotr", 30);

		System.out.println(map);
		System.out.println(piotr);

	}

	public static String high(String s) {
		List<String> collect = Arrays.stream(s.split(" "))
				.collect(Collectors.toList());

		String sample = collect.get(0);

		char[] chars = sample.toCharArray();

		for (char c:chars) {
			System.out.println((int)c-96);
		}

		System.out.println(collect);
		return "";


	}

}


