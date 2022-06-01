package pl.migibud.designpattern.facade.ex1;

public class SortingManager {
    private Algorithm bubbleSort;
    private Algorithm mergeSort;
    private Algorithm quickSort;

    public SortingManager() {
        bubbleSort = new BubbleSort();
        mergeSort = new MergeSort();
        quickSort = new QuickSort();
    }

    public void doBubbleSort() {
        this.bubbleSort.sort();
    }

    public void mergeSort() {
        this.mergeSort.sort();
    }

    public void quickSort() {
        this.quickSort.sort();
    }
}
