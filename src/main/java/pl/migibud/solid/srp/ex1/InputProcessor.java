package pl.migibud.solid.srp.ex1;

import java.util.Scanner;

public class InputProcessor {

	public static Pair process() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		String firstNumber = scanner.nextLine();

		System.out.println("Enter second number: ");
		String secondNumber = scanner.nextLine();

		scanner.close();
		Pair pair = new Pair(firstNumber,secondNumber);
		return pair;
	}

}
