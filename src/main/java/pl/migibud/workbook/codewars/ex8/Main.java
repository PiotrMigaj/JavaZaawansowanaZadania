package pl.migibud.workbook.codewars.ex8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {


		Object[] ints = {1, 2, 3, 4, 5};

		int n = 4;
//		int lengthOfArray = ints.length;
//		int numberOfFullRotations = n / lengthOfArray;
//		int dzielenieModulo = n % lengthOfArray;
//		System.out.println(dzielenieModulo);
//
//		List<Integer> ints1 = Arrays.stream(ints).boxed().collect(Collectors.toList());
//		System.out.println(ints1);
//
//		Collections.rotate(ints1, 13);
//		System.out.println(ints1);
//		System.out.println(numberOfFullRotations);

		Main mainClass = new Main();

		Object[] resultInts = mainClass.rotate(ints,4);
		System.out.println(Arrays.toString(resultInts));




	}

	public Object[] rotate(Object[] data, int n) {

		List<Object> listToBeRotated = Arrays.stream(data).collect(Collectors.toList());
		Collections.rotate(listToBeRotated, n);
		return listToBeRotated.toArray();
	}

}
