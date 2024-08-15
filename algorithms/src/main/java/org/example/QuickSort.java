package org.example;

public class QuickSort {
    // Method to perform the partitioning of the array
    public int partition(int arr[], int low, int high) {
        // Select the last element as the pivot
        int pivot = arr[high];
        // Initialize the index of the smaller element
        int i = (low - 1);

        // Iterate over the array from the low index to the high index
        for (int j = low; j < high; j++) {
            // If the current element is less than or equal to the pivot
            if (arr[j] <= pivot) {
                // Increment the index of the smaller element
                i++;

                // Swap the elements at index i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index (i+1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partition index
        return i + 1;
    }

    // Method to implement the QuickSort algorithm
    public void quickSort(int arr[], int low, int high) {
        // Check if the low index is less than the high index
        if (low < high) {
            // Partition the array and get the partition index
            int pi = partition(arr, low, high);

            // Recursively sort the elements before the partition index
            quickSort(arr, low, pi - 1);
            // Recursively sort the elements after the partition index
            quickSort(arr, pi + 1, high);
        }
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        // Create an instance of the QuickSort class
        QuickSort sorter = new QuickSort();
        // Initialize an array of integers to be sorted
        int[] arr = {2, 7, 4, 0, 6};
        // Get the length of the array
        int n = arr.length;

        // Call the quickSort method to sort the array
        sorter.quickSort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
