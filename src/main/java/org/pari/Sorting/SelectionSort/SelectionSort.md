# Selection Sort Algorithm

## Introduction

Selection Sort is a simple, comparison-based sorting algorithm. It works by repeatedly selecting the smallest (or largest, depending on sorting order) element from the unsorted portion of an array and swapping it with the first unsorted element. This process is repeated until the entire array is sorted.

## Algorithm Explanation

The basic idea of Selection Sort is to divide the array into two parts:
- The **sorted part** on the left.
- The **unsorted part** on the right.

At each step:
1. Find the minimum element in the unsorted portion of the array.
2. Swap it with the first unsorted element, expanding the sorted portion.
3. Repeat this process until the entire array is sorted.

### Example

For an input array: `[64, 25, 12, 22, 11]`

1. Find the minimum element (11) and swap it with the first element:

    ```plaintext
    [11, 25, 12, 22, 64]
    ```

2. Find the next minimum element (12) and swap it with the second element:

    ```plaintext
    [11, 12, 25, 22, 64]
    ```

3. Find the next minimum element (22) and swap it with the third element:

    ```plaintext
    [11, 12, 22, 25, 64]
    ```

4. Find the next minimum element (25) and swap it with the fourth element:

    ```plaintext
    [11, 12, 22, 25, 64]
    ```

The array is now sorted.

## Pseudocode

```plaintext
SelectionSort(arr[], n)
   repeat (n - 1) times
      set the first unsorted element as the minimum
      for each unsorted element
         if the element is smaller than the current minimum
            set the element as the new minimum
      swap the minimum with the first unsorted element
```
## Time Complexity

- **Best Case:** `O(n²)`
- **Average Case:** `O(n²)`
- **Worst Case:** `O(n²)`

## Space Complexity

- **Space Complexity:** `O(1)` (in-place sorting)
- 
## Characteristics of Selection Sort

- **In-place**: The algorithm sorts the array without using additional memory.
- **Not Stable**: Selection Sort can rearrange equal elements, so their relative order may change.

## Use Cases

Selection Sort is not the most efficient algorithm for large datasets but can be useful in the following scenarios:
- When the number of swaps is more critical than comparisons.
- When working with small datasets or limited memory environments.
