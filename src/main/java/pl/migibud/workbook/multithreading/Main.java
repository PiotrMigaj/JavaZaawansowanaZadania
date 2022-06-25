package pl.migibud.workbook.multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MojeZadanie mojeZadanie = new MojeZadanie();

//        Runnable runnable  = ()->{
//            mojeZadanie.doDziela();
//        };

        Thread thread = new Thread(mojeZadanie);
        thread.start();
        thread.join();


        System.out.println("z powrotem w main");
        System.out.println(mojeZadanie.counter);


    }

}
