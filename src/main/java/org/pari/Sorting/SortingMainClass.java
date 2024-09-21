package org.pari.Sorting;

import java.util.Arrays;

public class SortingMainClass {
    public static void main(String[] ss) {
        Integer[] unSortedArray = {4, 2, 3};
        System.out.println("Unsorted array : " + Arrays.toString(unSortedArray));

        SelectionSort bubbleSort = new SelectionSort();

        Integer[] sortedArray = bubbleSort.sort(unSortedArray, SortType.ASC);
        System.out.println("Sorted Array in Ascending Order : " + Arrays.toString(sortedArray));

        sortedArray = bubbleSort.sort(unSortedArray, SortType.DESC);
        System.out.println("Sorted Array in Descending Order : " + Arrays.toString(sortedArray));
    }
}
