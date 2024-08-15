package org.example;

public class BubbleSort { // Declares a public class named BubbleSort.

    public void bubbleSort(int arr[], int n) { // Defines a method bubbleSort that takes an array of integers arr[] and an integer n as parameters.
        
        for (int i = 0; i < n-1; i++) { // Outer loop: Runs from 0 to n-2, iterating over the array multiple times.
            
            for (int j = 0; j < n-i-1; j++) { // Inner loop: Runs from 0 to n-i-2, comparing adjacent elements.
                
                if (arr[j] > arr[j+1]) { // Checks if the current element is greater than the next element.
                    
                    int temp = arr[j]; // Temporarily stores the value of arr[j] in a variable temp.
                    arr[j] = arr[j+1]; // Swaps arr[j] with arr[j+1].
                    arr[j+1] = temp; // Assigns the value of temp (which is the original arr[j]) to arr[j+1].
                }
            }
        }
    }

    // Tester to make sure it works
    public static void main(String[] args) { // The main method, which is the entry point of the program.
        
        BubbleSort sorter = new BubbleSort(); // Creates an instance of the BubbleSort class.
        int[] arr = {5, 3, 1, 2, 8}; // Initializes an array of integers with the given values.
        int n = arr.length; // Gets the length of the array and stores it in the variable n.

        sorter.bubbleSort(arr, n); // Calls the bubbleSort method on the array arr.

        for (int i = 0; i < n; i++) { // Loops through the sorted array.
            System.out.print(arr[i] + " "); // Prints each element of the sorted array followed by a space.
        }
    }
}
