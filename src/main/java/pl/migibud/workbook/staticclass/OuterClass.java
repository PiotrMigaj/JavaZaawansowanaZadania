package pl.migibud.workbook.staticclass;

import org.apache.bcel.classfile.InnerClass;

public class OuterClass {

	private static String name = "Piotr";

	public OuterClass() {

		InnerClass innerClass = new InnerClass();
		innerClass.print();

	}

	private static class InnerClass{

		public void print(){
			System.out.println("test inner");
		}

	}
}
