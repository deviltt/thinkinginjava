package com.designpattern.strategy;

public class Sort implements ISort {
    private ISort sort;

    public Sort(SortStrategy strategy) {
        setStrategy(strategy);
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    public void setStrategy(SortStrategy strategy) {
        switch (strategy) {
            case BUBBLE_SORT:
                sort = new BubbleSort();
                break;
            case INSERT_SORT:
                sort = new InsertSort();
                break;
            case SELECTION_SORT:
                sort = new SelectionSort();
                break;
            default:
                throw new IllegalArgumentException("There's no such strategy yet.");
        }
    }
}
