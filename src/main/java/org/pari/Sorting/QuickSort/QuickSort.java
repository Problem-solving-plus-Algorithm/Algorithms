package org.pari.Sorting.QuickSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingConfig;
import org.pari.Sorting.SortingStrategy;

import java.util.Random;


public class QuickSort implements SortingStrategy {

    static Random random = new Random();

    private int partition(Integer[] array, int low, int high, SortType sortType, boolean randomizedPivotSelection) {

        makePivotElementRandomIfNeeded(array, low, high, randomizedPivotSelection);
        int pivot = array[high];
        int j = low;
        for(int i = low;i < high;i++){
         if(moveElementToLeft(array[i], pivot, sortType)){
             int temp = array[j];
             array[j] = array[i];
             array[i] = temp;
             j++;
         }
        }

        // move pivot to its position
        int temp = array[j];
        array[j] = pivot;
        array[high] = temp;

        return j;
    }

    private void makePivotElementRandomIfNeeded(Integer[] array, int low, int high, boolean randomizedPivotSelection) {
        if(randomizedPivotSelection){
            //since low can be values greater than 0
            // generate random value from high and low diff and add low to the random value.
            int randomIndex = random.nextInt(high - low) + low;

            //swap the random index with high location so that pivot element is random but high position is considered as pivot.
            int temp = array[high];
            array[high] = array[randomIndex];
            array[randomIndex] = temp;

        }
    }

    private boolean moveElementToLeft(int a, int b, SortType sortType){
        return switch (sortType) {
            case DESC -> a > b;
            case ASC -> a < b;
        };
    }

    private void quickSort(Integer[] array, int low, int high, SortType sortType, boolean randomizedPivotSelection){
        if (low < high){
           int partitionKey = partition(array, low, high, sortType, randomizedPivotSelection);

           quickSort(array, low, partitionKey-1, sortType, randomizedPivotSelection);
           quickSort(array, partitionKey+1, high, sortType, randomizedPivotSelection);
        }
    }

    @Override
    public Integer[] sort(Integer[] array, SortingConfig sortingConfig) {
        // downcast to get QuickSort methods
        QuickSortConfig config = (QuickSortConfig) sortingConfig;
        quickSort(array, 0, array.length-1, config.getSortType(), config.isRandomizedPivotSelection());
        return array;
    }
}
