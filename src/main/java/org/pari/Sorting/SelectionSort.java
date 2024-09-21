package org.pari.Sorting;

public class SelectionSort {
    protected Integer[] sort(Integer[] inputArray, SortType sortType) {
        int size = inputArray.length;
        for (int i = 0; i < size; i++) {
            int minOrMaxIndex = i;
            for (int j = i + 1; j < size; j++) {
                minOrMaxIndex = getMinOrMaxIndex(inputArray, j, minOrMaxIndex, sortType);
            }
            Integer temp = inputArray[i];
            inputArray[i] = inputArray[minOrMaxIndex];
            inputArray[minOrMaxIndex] = temp;
        }
        return inputArray;
    }

    private int getMinOrMaxIndex(Integer[] inputArray, int j, int minOrMaxIndex, SortType sortType) {
        switch (sortType) {
            case ASC:
                if (inputArray[j] < inputArray[minOrMaxIndex]) {
                    minOrMaxIndex = j;
                }
                break;
            case DESC:
                if (inputArray[j] > inputArray[minOrMaxIndex]) {
                    minOrMaxIndex = j;
                }
                break;
        }
        return minOrMaxIndex;
    }
}
