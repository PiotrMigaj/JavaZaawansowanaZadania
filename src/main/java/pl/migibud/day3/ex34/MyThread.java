package pl.migibud.day3.ex34;

import java.util.Random;

public class MyThread extends Thread{




    @Override
    public void run()
    {

        try {
            String getName = Thread.currentThread().getName();
            System.out.println("Starting: "+getName);
            int sleepingTime = new Random().nextInt(2000);
            System.out.println("Random value: "+ sleepingTime + " for "+getName);
            System.out.println("Sleeping");
            Thread.sleep(sleepingTime);
            System.out.println("Running again "+getName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
