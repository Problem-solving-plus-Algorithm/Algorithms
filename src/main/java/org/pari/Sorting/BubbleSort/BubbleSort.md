# Bubble Sort Algorithm

## Introduction

Bubble Sort is a simple, comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent pairs, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

## Algorithm Explanation

Bubble Sort works by repeatedly swapping adjacent elements if they are in the wrong order. The algorithm gets its name because larger elements "bubble" up to the top of the list, and smaller elements sink to the bottom.

### Steps of the Algorithm

1. Start with the first element in the array.
2. Compare the current element with the next element.
3. If the current element is greater than the next element (for ascending order), swap them.
4. Move to the next pair and repeat the process.
5. After one complete pass, the largest element will be at the end.
6. Repeat the process for the remaining unsorted part of the list until no swaps are needed.

### Example

For an input array: `[5, 3, 8, 4, 2]`

- **Pass 1**:  
    Compare adjacent elements and swap if needed:  
    `[5, 3, 8, 4, 2] -> [3, 5, 8, 4, 2] -> [3, 5, 8, 4, 2] -> [3, 5, 4, 8, 2] -> [3, 5, 4, 2, 8]`

- **Pass 2**:  
    Continue comparing elements, the largest element is already in the correct position:  
    `[3, 5, 4, 2, 8] -> [3, 5, 4, 2, 8] -> [3, 4, 5, 2, 8] -> [3, 4, 2, 5, 8]`

- **Pass 3**:  
    The next largest element moves into position:  
    `[3, 4, 2, 5, 8] -> [3, 4, 2, 5, 8] -> [3, 2, 4, 5, 8]`

- **Pass 4**:  
    The list is now sorted:  
    `[3, 2, 4, 5, 8] -> [2, 3, 4, 5, 8]`

### Pseudocode

```text
function bubbleSort(array)
    n = length of array
    for i from 0 to n-1
        swapped = false
        for j from 0 to n-i-1
            if array[j] > array[j+1]
                swap(array[j], array[j+1])
                swapped = true
        if not swapped
            break
    return array
```


## Optimizations

A small optimization can be applied to Bubble Sort:
- **Stop Early**: If no swaps are made in a pass, the array is already sorted, and the algorithm can stop early.

## Time Complexity

- **Best Case:** `O(n)` (when the array is already sorted)
- **Average Case:** `O(n²)`
- **Worst Case:** `O(n²)`

## Space Complexity

- **Space Complexity:** `O(1)` (in-place sorting)

## Use Cases

While Bubble Sort is not efficient for large datasets due to its quadratic time complexity, it can be useful in the following cases:
- For educational purposes and as a simple example of sorting algorithms.
- When dealing with small datasets or nearly sorted arrays.
- When memory is constrained, as Bubble Sort only requires constant `O(1)` space.
