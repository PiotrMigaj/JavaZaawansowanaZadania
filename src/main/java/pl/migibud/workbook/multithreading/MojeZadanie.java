package pl.migibud.workbook.multithreading;

public class MojeZadanie implements Runnable{

    int counter;

    @Override
    public void run() {
        this.doDziela();
    }

    public void doDziela(){
        this.kolejnaRobota();
        System.out.println(counter);
    }

    public void kolejnaRobota(){
        System.out.println("wierzchołek stosu!");
        for (int i=0;i<1000;i++){
            counter++;
        }
    }
}
