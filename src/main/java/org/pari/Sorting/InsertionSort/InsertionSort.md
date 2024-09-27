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

## Stability in Selection Sort:
Selection Sort is generally considered unstable because it performs swaps based on finding the minimum (or maximum) element and then swapping it with the first unsorted element. If the minimum element has the same value as another element earlier in the array, their relative order will be disrupted during the swap.

### Example of Instability in Selection Sort:
Consider the following array, where we have two identical elements (3):
```
[3A, 2, 3B, 1]
```

In the first iteration, Selection Sort finds the minimum (1) and swaps it with 3A, leading to:

```
[1, 2, 3B, 3A]
```

Now the relative order of the two 3s (3A and 3B) is disturbed—3B is now before 3A, even though 3A appeared first in the original array.

This happens because Selection Sort simply swaps the minimum element, without any regard for whether the elements are equal.