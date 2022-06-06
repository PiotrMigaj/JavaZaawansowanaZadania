package pl.migibud.solid.srp.ex1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		System.out.println("Welcome to the Application!");

		Pair pair = InputProcessor.process();

		if(!ViolationChecker.isValid(pair)){
			System.out.println("One of input is invalid!");
			return;
		}

		int firstInteger = Integer.valueOf(pair.getFirstValue());
		int secondInteger = Integer.valueOf(pair.getSecondValue());

		int result = MathOperation.execute(firstInteger,secondInteger);

		System.out.println("The result is: "+result);
		System.out.println("End of app...");

	}
}
