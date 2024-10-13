package org.pari.Sorting.InsertionSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingConfig;

public class InsertionSortConfig implements SortingConfig {
    private final SortType sortType;

    public InsertionSortConfig(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public SortType getSortType() {
        return sortType;
    }
}

