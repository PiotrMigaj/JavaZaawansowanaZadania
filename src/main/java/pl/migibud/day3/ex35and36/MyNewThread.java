package pl.migibud.day3.ex35and36;

import java.util.Random;

public class MyNewThread implements Runnable{
    private final String getName;

    public MyNewThread(String getName) {
        this.getName = getName;
    }

    @Override
    public void run() {
        try {
            //String getName = Thread.currentThread().getName();
            System.out.println("Starting: "+getName);
            int sleepingTime = new Random().nextInt(2000);
            System.out.println("Random value: "+ sleepingTime + " for "+getName);
            while (!Thread.interrupted()){
                System.out.println("Sleeping");
                Thread.sleep(sleepingTime);
            }
            System.out.println("Running again "+getName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
