package org.pari.Sorting.BubbleSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingStrategy;

public class BubbleSort implements SortingStrategy {

    @Override
    public Integer[] sort(Integer[] inputArray, SortType sortType) {
        int size = inputArray.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean pairInOrder = isPairInOrder(inputArray, i, j, sortType);
                if(!pairInOrder) {
                    Integer temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }

    private boolean isPairInOrder(Integer[] inputArray, int i, int j, SortType sortType) {
        boolean pairInOrder = true;
        switch (sortType) {
            case ASC:
                if (inputArray[j] > inputArray[i]) {
                    pairInOrder = false;
                }
                break;
            case DESC:
                if (inputArray[j] < inputArray[i]) {
                    pairInOrder = false;
                }
                break;
        }
        return pairInOrder;
    }
}
