package org.pari.Sorting.InsertionSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingStrategy;


public class InsertionSort implements SortingStrategy {

    @Override
    public Integer[] sort(Integer[] inputArray, SortType sortType) {
        int size = inputArray.length;
        for (int i = 1; i < size; i++) {
            int currValue = inputArray[i];
            // last sorted index
            int j = i-1;
            while(j >= 0 && continueIterating(inputArray, currValue, j, sortType)){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = currValue;
        }
        return inputArray;
    }

    private boolean continueIterating(Integer[] inputArray, int currValue, int j, SortType sortType) {
        return switch (sortType) {
            case ASC -> currValue < inputArray[j];
            case DESC -> currValue > inputArray[j];
        };
    }
}
