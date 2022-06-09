package pl.migibud.solid.srp.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
	private static final int THRESHOLD = 5;
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to the Application!");
		List<Integer> nums = getIntegers();
		System.out.println(nums);
		sort(nums);
		print(nums);
	}

	private static void print(List<Integer> nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	private static void sort(List<Integer> nums) {
		Collections.sort(nums);
	}

	private static List<Integer> getIntegers() {

		Scanner scanner = SCANNER;
		List<Integer> nums = new ArrayList<>();
		System.out.println("Enter 5 valid integers in the range [0, 10]");
		while (nums.size() < THRESHOLD) {

			String s = scanner.nextLine();
			if (!isInputValid(s)) {
				continue;
			}
			int num = Integer.parseInt(s);
			nums.add(num);
		}
		scanner.close();
		return nums;
	}

	private static boolean isInputValid(String input) {

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Wrong input!");
			return false;
		}
		int num = Integer.parseInt(input);
		if (num < 0 || num > 10) {
			System.out.println("Invalid range! Try again!");
			return false;
		}
		return true;
	}
}
