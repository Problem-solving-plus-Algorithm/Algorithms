# Quick Sort

Quick Sort is a highly efficient sorting algorithm that utilizes the **divide-and-conquer** strategy. It selects a pivot element, partitions the array into two subarrays based on the pivot, and recursively sorts the subarrays.

## How It Works

1. **Pick a pivot element** from the array. The choice of pivot can affect the performance of the algorithm.
2. **Partition** the array such that:
  - Elements less than the pivot are moved to the left of the pivot.
  - Elements greater than the pivot are moved to the right.
3. Recursively apply the same process to the left and right subarrays until the base case is reached (when the subarray has one or zero elements).
4. Combine the sorted subarrays to produce the final sorted array.

### Example

Consider the array:

- **Initial Array**:  
  `[5, 3, 8, 4, 2]`

- **Pass 1** (pivot `5`):  
  Partition the array around `5`:  
  `[3, 4, 2, 5, 8]`  
  Now, `5` is in its correct position.

- **Pass 2** (subarray `[3, 4, 2]`, pivot `4`):  
  Partition around `4`:  
  `[3, 2, 4]`  
  `4` is now in its correct position.

- **Pass 3** (subarray `[3, 2]`, pivot `3`):  
  Partition around `3`:  
  `[2, 3]`  
  `3` is now in its correct position.

Now the entire array is:  
`[2, 3, 4, 5, 8]`

### Pseudocode

```text
function quickSort(array)
    if length of array <= 1
        return array
    pivot = choose a pivot from array
    left = elements less than pivot
    right = elements greater than pivot
    return quickSort(left) + [pivot] + quickSort(right)
```

## Time Complexity

- **Best Case:** `O(n log n)` (when the pivot divides the array into two equal halves)
- **Average Case:** `O(n log n)`
- **Worst Case:** `O(n²)` (when the smallest or largest element is always chosen as the pivot)

## Space Complexity

- **Space Complexity:** `O(log n)` (due to the recursive call stack)

## Characteristics of Quick Sort

- **In-place**: Quick Sort sorts the array without needing additional storage for the elements.
- **Unstable**: Quick Sort can change the relative order of equal elements, making it unstable.

## Use Cases

Quick Sort is typically used when:

- The dataset is large, and average-case performance is more important than the worst-case performance.
- Space complexity needs to be minimized as it operates in place.
- The data is randomly distributed.


