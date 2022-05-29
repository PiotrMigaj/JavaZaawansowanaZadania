package pl.migibud.day3.ex37;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i=0;i<10;i++){
            executor.execute(new ThreadPlaygroundRunnable("task - "+i));
            System.out.println(executor);
        }
        System.out.println(executor);
        executor.shutdown();

    }
}
