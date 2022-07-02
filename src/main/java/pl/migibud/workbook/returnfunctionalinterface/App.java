package pl.migibud.workbook.returnfunctionalinterface;

import java.util.function.Function;

public class App {
	public static void main(String[] args) {

		Integer apply = myFunc().apply(2);

		System.out.println(apply);
	}

	public static Function<Integer,Integer> myFunc(){
		return x->2*x;
	}
}
