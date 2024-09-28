package org.pari.Sorting.QuickSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingMainClass;
import org.pari.Sorting.SortingStrategy;

import java.util.Arrays;

public class QuickSort implements SortingStrategy {

    private int partition(Integer[] array, int low, int high, SortType sortType) {

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

    private boolean moveElementToLeft(int a, int b, SortType sortType){
        return switch (sortType) {
            case DESC -> a > b;
            case ASC -> a < b;
        };
    }

    private void quickSort(Integer[] array, int low, int high, SortType sortType){
        if (low < high){
           int partitionKey = partition(array, low, high, sortType);

           quickSort(array, low, partitionKey-1, sortType);
           quickSort(array, partitionKey+1, high, sortType);
        }
    }
    @Override
    public Integer[] sort(Integer[] array, SortType sortType) {
        quickSort(array, 0, array.length-1, sortType);
        return array;
    }
}
