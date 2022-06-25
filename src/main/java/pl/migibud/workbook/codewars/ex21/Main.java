package pl.migibud.workbook.codewars.ex21;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		int[] ints = {};

//		int[] ints1 = IntStream.range(0, ints.length).toArray();
//
//		System.out.println(Arrays.toString(ints1));
//
//		Arrays.sort(ints);
//
//		boolean equals = Arrays.equals(ints, ints1);
//
//		System.out.println(equals);

		System.out.println(isAllPossibilities(ints));


	}

	public static boolean isAllPossibilities(int[] arg) {
		if (arg.length==0){
			return false;
		}
		Arrays.sort(arg);
		int[] result = IntStream.range(0, arg.length).toArray();
		return Arrays.equals(arg, result);
	}
}
