package org.example;

public class BubbleSort {
    public void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // Tester to make sure it works
    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {5, 3, 1, 2, 8};
        int n = arr.length;

        sorter.bubbleSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}