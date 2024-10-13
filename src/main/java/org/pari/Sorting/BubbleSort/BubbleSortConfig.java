package org.pari.Sorting.BubbleSort;

import org.pari.Sorting.SortType;
import org.pari.Sorting.SortingConfig;

public class BubbleSortConfig implements SortingConfig {
    private final SortType sortType;

    public BubbleSortConfig(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public SortType getSortType() {
        return sortType;
    }
}

