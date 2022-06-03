package pl.migibud.workbook.codewars.ex6;

import java.util.Comparator;
import java.util.Map;

public class NamesComparator implements Comparator<String> {

    private Map<String,Integer> sortOrder;

    public NamesComparator(Map<String, Integer> sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(String  i1, String i2)
    {
        Integer namePos1 = sortOrder.get(i1);
        if (namePos1 == null)
        {
            throw new IllegalArgumentException("Bad weekday encountered: " +
                    i1);
        }
        Integer namePos2 = sortOrder.get(i2);
        if (namePos2 == null)
        {
            throw new IllegalArgumentException("Bad weekday encountered: " +
                    i2);
        }
        return namePos1.compareTo(namePos2);
    }
}
