package org.pari.Sorting.SelectionSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingConfig;

public class SelectionSortConfig implements SortingConfig {
    private final SortType sortType;

    public SelectionSortConfig(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public SortType getSortType() {
        return sortType;
    }
}

