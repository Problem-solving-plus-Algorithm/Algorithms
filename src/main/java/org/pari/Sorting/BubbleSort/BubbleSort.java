package org.pari.Sorting.BubbleSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingStrategy;

public class BubbleSort implements SortingStrategy {

    @Override
    public Integer[] sort(Integer[] inputArray, SortType sortType) {
        int size = inputArray.length;
        for (int i = 0; i < size-1; i++) {
            boolean swappedAPair = false;
            for (int j = 0; j < (size - 1- i); j++) {
                boolean pairInOrder = isPairInOrder(inputArray, j, j+1, sortType);
                if(!pairInOrder) {
                    Integer temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                    swappedAPair = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if(!swappedAPair){
                break;
            }
        }
        return inputArray;
    }

    private boolean isPairInOrder(Integer[] inputArray, int i, int j, SortType sortType) {
        boolean pairInOrder = true;
        switch (sortType) {
            case ASC:
                if (inputArray[j] < inputArray[i]) {
                    pairInOrder = false;
                }
                break;
            case DESC:
                if (inputArray[j] > inputArray[i]) {
                    pairInOrder = false;
                }
                break;
        }
        return pairInOrder;
    }
}
