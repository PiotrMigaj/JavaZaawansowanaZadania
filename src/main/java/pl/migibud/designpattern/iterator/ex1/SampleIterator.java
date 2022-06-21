package pl.migibud.designpattern.iterator.ex1;

import java.util.Iterator;
import java.util.List;

public class SampleIterator implements Iterator<String> {

    private List<String> samples;
    private int index;

    public SampleIterator(List<String> samples) {
        this.samples = samples;
    }

    @Override
    public boolean hasNext() {
        return index<samples.size();
    }

    @Override
    public String next() {
        if(hasNext()){
            return samples.get(index++);
        }
        return null;
    }
}
