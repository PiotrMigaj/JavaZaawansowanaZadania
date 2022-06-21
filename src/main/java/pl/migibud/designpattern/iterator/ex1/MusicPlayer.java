package pl.migibud.designpattern.iterator.ex1;

import java.util.Iterator;
import java.util.List;

public class MusicPlayer implements Player {

    private final List<String> samples = List.of("Song 1","Song 2","Song 3","Song 4","Song 5","Song 6");


    @Override
    public Iterator<String> getIterator() {
        return new SampleIterator(samples);
    }
}
