package org.pari.Sorting;

import org.pari.Sorting.SelectionSort.SelectionSort;
import org.pari.Sorting.BubbleSort.BubbleSort;

import java.util.Arrays;

public class SortingMainClass {

    private SortingStrategy sortingStrategy;

    public SortingMainClass(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public static void main(String[] args) {
        Integer[] unSortedArray = {4, 2, 3, -1};
        System.out.println("Unsorted array : " + Arrays.toString(unSortedArray));

        // Use SelectionSort strategy
        SortingMainClass sortingContext = new SortingMainClass(new SelectionSort());
        Integer[] sortedArray = sortingContext.sortArray(unSortedArray, SortType.ASC);
        System.out.println("Sorted Array in Ascending Order with SelectionSort : " + Arrays.toString(sortedArray));

        // Switch to BubbleSort strategy
        sortingContext.setSortingStrategy(new BubbleSort());
        sortedArray = sortingContext.sortArray(unSortedArray, SortType.DESC);
        System.out.println("Sorted Array in Descending Order with BubbleSort : " + Arrays.toString(sortedArray));
    }

    public Integer[] sortArray(Integer[] array, SortType sortType) {
        return sortingStrategy.sort(array.clone(), sortType);  // Clone array to avoid in-place modification
    }
}
