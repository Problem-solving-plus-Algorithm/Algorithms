package org.pari.Sorting.QuickSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingConfig;

public class QuickSortConfig implements SortingConfig {
    private final SortType sortType;
    private final boolean randomizedPivotSelection;

    public QuickSortConfig(SortType sortType, boolean randomizedPivotSelection) {
        this.sortType = sortType;
        this.randomizedPivotSelection = randomizedPivotSelection;
    }

    @Override
    public SortType getSortType() {
        return sortType;
    }

    public boolean isRandomizedPivotSelection() {
        return randomizedPivotSelection;
    }
}

