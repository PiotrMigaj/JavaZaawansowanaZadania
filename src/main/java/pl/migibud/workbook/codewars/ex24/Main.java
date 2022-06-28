package pl.migibud.workbook.codewars.ex24;

public class Main {
	public static void main(String[] args) {

		int num = 0112;

//		String input = String.valueOf(num);
//
//		StringBuilder sb = new StringBuilder(input).reverse();
//		System.out.println(sb);

//		int result = Integer
//				.parseInt(
//						new StringBuilder(String.valueOf(num))
//						.reverse()
//						.toString()
//				);
//
//		System.out.println(result);

		System.out.println(sortDesc(num));
		System.out.println(113);


	}

	public static int sortDesc(final int num) {
		return Integer
				.parseInt(
						new StringBuilder(String.valueOf(num))
								.reverse()
								.toString()
				);
	}
}
