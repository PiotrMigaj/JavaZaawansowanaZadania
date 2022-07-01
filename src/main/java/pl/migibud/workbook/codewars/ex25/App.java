package pl.migibud.workbook.codewars.ex25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {

	private static final Function<Double,Double> myFunction = x->3d/2*Math.pow(Math.sin(x),3);
	private static final double a = 0d;
	private static final double b = Math.PI;


	public static void main(String[] args) throws InterruptedException {
		System.out.println(simpson(40));
		System.out.println(myFunction.apply(a));

	}

	public static double simpson(int n) throws InterruptedException {
		double fA = myFunction.apply(a);
		double fB = myFunction.apply(b);
		double h = (b-a)/n;

//		DoubleAdder doubleAdder = new DoubleAdder();
//
//		Runnable runnableFirstSum = ()->{
//			doubleAdder.add(4*IntStream.rangeClosed(1,n/2).mapToDouble(i->myFunction.apply(a+(2*i-1)*h)).sum());
//		};
//
//		Runnable runnableSecondSum = ()->{
//			doubleAdder.add(2*IntStream.rangeClosed(1,n/2-1).mapToDouble(i->myFunction.apply(a+2*i*h)).sum());
//		};
//
//		doubleAdder.add(fA+fB);
//
//		ExecutorService executor = Executors.newFixedThreadPool(2);
//		executor.submit(runnableFirstSum);
//		executor.submit(runnableSecondSum);
//		executor.shutdown();


		double firstSum = 4*IntStream.rangeClosed(1,n/2).mapToDouble(i->myFunction.apply(a+(2*i-1)*h)).sum();
		double secondSum = 2*IntStream.rangeClosed(1,n/2-1).mapToDouble(i->myFunction.apply(a+2*i*h)).sum();

//		Thread thread1 = new Thread(runnableFirstSum);
//		Thread thread2 = new Thread(runnableSecondSum);
//		thread1.start();
//		thread2.start();
//		thread1.join();
//		thread2.join();
//		return (b-a)/(3*n)*(doubleAdder.sum());
		return (b-a)/(3*n)*(fA+fB+firstSum+secondSum);
	}

}
