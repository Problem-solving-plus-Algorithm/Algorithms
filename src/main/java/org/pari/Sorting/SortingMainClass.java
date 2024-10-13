package org.pari.Sorting;

import org.pari.Sorting.BubbleSort.BubbleSortConfig;
import org.pari.Sorting.InsertionSort.InsertionSort;
import org.pari.Sorting.InsertionSort.InsertionSortConfig;
import org.pari.Sorting.QuickSort.QuickSort;
import org.pari.Sorting.QuickSort.QuickSortConfig;
import org.pari.Sorting.SelectionSort.SelectionSort;
import org.pari.Sorting.BubbleSort.BubbleSort;
import org.pari.Sorting.SelectionSort.SelectionSortConfig;

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
        SelectionSortConfig selectionSortConfig = new SelectionSortConfig(SortType.ASC);
        Integer[] sortedArray = sortingContext.sortArray(unSortedArray, selectionSortConfig);
        System.out.println("Sorted Array in Ascending Order with SelectionSort : " + Arrays.toString(sortedArray));

        // Switch to BubbleSort strategy
        sortingContext.setSortingStrategy(new BubbleSort());
        BubbleSortConfig bubbleSortConfig = new BubbleSortConfig(SortType.DESC);
        sortedArray = sortingContext.sortArray(unSortedArray, bubbleSortConfig);
        System.out.println("Sorted Array in Descending Order with BubbleSort : " + Arrays.toString(sortedArray));

        // Switch to InsertionSort strategy
        sortingContext.setSortingStrategy(new InsertionSort());
        InsertionSortConfig insertionSortConfig = new InsertionSortConfig(SortType.ASC);
        sortedArray = sortingContext.sortArray(unSortedArray, insertionSortConfig);
        System.out.println("Sorted Array in Ascending Order with InsertionSort : " + Arrays.toString(sortedArray));

        // Switch to QuickSort strategy
        QuickSortConfig quickSortConfig = new QuickSortConfig(SortType.DESC, false);
        sortedArray = sortingContext.sortArray(unSortedArray, quickSortConfig);
        System.out.println("Sorted Array in Ascending Order with QuickSort : " + Arrays.toString(sortedArray));

        // Switch to Randomized pivot selection QuickSort strategy
        sortingContext.setSortingStrategy(new QuickSort());
        quickSortConfig = new QuickSortConfig(SortType.ASC, true);
        sortedArray = sortingContext.sortArray(unSortedArray, quickSortConfig);
        System.out.println("Sorted Array in Descending Order with Randomized QuickSort : " + Arrays.toString(sortedArray));
    }

    // sorting strategy with custom changes
    public Integer[] sortArray(Integer[] array, SortingConfig sortingConfig) {
        return sortingStrategy.sort(array.clone(), sortingConfig);  // Clone array to avoid in-place modification
    }
}
