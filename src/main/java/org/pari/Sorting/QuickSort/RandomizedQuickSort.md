# Randomized Quick Sort

Randomized Quick Sort is an enhancement of the classic Quick Sort algorithm. By using a randomly chosen pivot during partitioning, this version reduces the likelihood of hitting worst-case performance scenarios, making it more efficient on average for a wide range of input data.

## How It Works

1. **Random Pivot Selection**: A random pivot is chosen from the array. This helps avoid poor performance that can occur with already sorted or highly patterned data.

2. **Partitioning**: The array is divided into two subarrays:
  - Elements smaller than the pivot go to the left.
  - Elements larger than the pivot go to the right.

3. **Recursion**: The process is recursively applied to the left and right subarrays until the entire array is sorted.

### Example

Consider the array `[10, 7, 8, 9, 1, 5]`:

- **Pass 1** (random pivot `5`):  
  Partition the array around `5`:  
  `[1, 5, 8, 9, 7, 10]`  
  Now, `5` is in its correct position.

- **Pass 2** (subarray `[1]` and subarray `[8, 9, 7, 10]`):  
  Pick a random pivot from the second subarray, say `9`:  
  `[1, 5, 8, 7, 9, 10]`  
  Now `9` is in its correct position.

- **Pass 3** (subarray `[8, 7]`):  
  Pick a random pivot, say `7`:  
  `[1, 5, 7, 8, 9, 10]`  
  Now `7` is in its correct position.

The entire array is now sorted: `[1, 5, 7, 8, 9, 10]`

## Pseudocode

```text
function randomizedQuickSort(array, low, high)
    if low < high
        pivotIndex = random(low, high)
        swap array[pivotIndex] with array[high]
        pivot = partition(array, low, high)
        randomizedQuickSort(array, low, pivot - 1)
        randomizedQuickSort(array, pivot + 1, high)
```

## Time Complexity

- **Best Case**: `O(n log n)`  
  The pivot consistently divides the array into two equal parts.

- **Average Case**: `O(n log n)`  
  The random pivot selection typically results in balanced partitions.

- **Worst Case**: `O(n²)`  
  This can still occur, though it's rare due to random pivot selection.

## Space Complexity

- **Space Complexity**: `O(log n)`  
  This is due to the recursive function calls.

## Characteristics

- **Randomized Pivot**: Randomizing the pivot helps avoid poor partitioning and improves average performance.
- **In-Place Sorting**: The algorithm sorts the array without needing additional storage, making it efficient in terms of space usage.
- **Unstable Sorting**: Equal elements may not retain their original order during sorting.

## Advantages Over Traditional Quick Sort

- **Improved Worst-Case Performance**: Random pivot selection reduces the chances of encountering the worst-case time complexity (`O(n²)`).
- **Efficient for Large Datasets**: Randomized Quick Sort performs well on large datasets, even when they have a specific order or pattern.

## Use Cases

Randomized Quick Sort is ideal when:

- You need to sort large datasets with unpredictable input patterns.
- You require an in-place sorting algorithm with a low memory footprint.
- You want to avoid the worst-case behavior associated with traditional Quick Sort.