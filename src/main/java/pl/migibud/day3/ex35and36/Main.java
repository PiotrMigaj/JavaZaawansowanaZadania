package pl.migibud.day3.ex35and36;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyNewThread("job-1"));
//        Thread thread2 = new Thread(new MyNewThread());
        thread1.start();
        thread1.interrupt();
//        thread2.start();
        TimeUnit.SECONDS.sleep(10);
        thread1.interrupt();


    }

}
