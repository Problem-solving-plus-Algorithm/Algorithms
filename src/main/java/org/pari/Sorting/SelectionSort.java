package org.pari.Sorting;

public class SelectionSort {
    protected Integer[] sort(Integer[] inputArray) {
        int size = inputArray.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (inputArray[j] < inputArray[minIndex]) {
                    minIndex = j;
                }
            }
            Integer temp = inputArray[i];
            inputArray[i] = inputArray[minIndex];
            inputArray[minIndex] = temp;
        }
        return inputArray;
    }
}
