# Insertion Sort Algorithm

## Introduction

Insertion Sort is a simple, comparison-based sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort, but it has the advantage of being simple to implement and efficient for small or nearly sorted datasets.

## Algorithm Explanation

Insertion Sort works by dividing the list into a sorted and an unsorted part. Initially, the first element is considered sorted, and the rest are unsorted. Then, each subsequent element is taken from the unsorted part and inserted into the correct position in the sorted part.

### Steps of the Algorithm

1. Start from the second element (index 1) in the array, assuming the first element is already sorted.
2. Compare the current element with the elements in the sorted part (left side).
3. Shift all elements in the sorted part that are greater than the current element to the right by one position.
4. Insert the current element into its correct position.
5. Repeat for all elements in the unsorted part until the array is fully sorted.

### Example

For an input array: `[5, 3, 8, 4, 2]`

- **Initial Array**:  
  `[5, 3, 8, 4, 2]`

- **Pass 1** (element `3`):  
  Compare `3` with `5`, and move `5` to the right. Insert `3` at the beginning:  
  `[3, 5, 8, 4, 2]`

- **Pass 2** (element `8`):  
  Compare `8` with `5`, no change needed as `8` is already in the correct position:  
  `[3, 5, 8, 4, 2]`

- **Pass 3** (element `4`):  
  Compare `4` with `8` and move `8` to the right. Compare `4` with `5` and move `5` to the right. Insert `4`:  
  `[3, 4, 5, 8, 2]`

- **Pass 4** (element `2`):  
  Compare `2` with `8`, `5`, `4`, and `3`, and shift all to the right. Insert `2` at the beginning:  
  `[2, 3, 4, 5, 8]`

### Pseudocode

```text
function insertionSort(array)
    n = length of array
    for i from 1 to n-1
        currValue = array[i]
        j = i-1
        while j >= 0 and array[j] > currValue
            array[j+1] = array[j]
            j = j-1
        array[j+1] = currValue
    return array
```
## Time Complexity

- **Best Case:** `O(n)` (when the array is already sorted)
- **Average Case:** `O(n²)`
- **Worst Case:** `O(n²)`

## Space Complexity

- **Space Complexity:** `O(1)` (in-place sorting)

## Characteristics of Insertion Sort

- **In-place**: The algorithm sorts the array without using additional memory.
- **Stable**: Elements with equal keys remain in their relative positions after sorting.

## Use Cases

Insertion Sort is typically used when:
- The dataset is small or nearly sorted.
- Stability is required (preserving the order of equal elements).
- Memory space is a concern since it uses `O(1)` auxiliary space.