package pl.migibud.designpattern.iterator.ex1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Player musicPlayer = new MusicPlayer();
        Iterator<String> iterator = musicPlayer.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
