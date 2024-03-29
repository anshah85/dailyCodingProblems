package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2, 6, 7, 11, 5, 2, 33, 11, 9, 0};
        System.out.println("Unsorted array is: " + Arrays.toString(arr));
        InsertionSort.insertionSort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int current = i;
            while (current > 0 && array[current] < array[current - 1]) {
                int temp = array[current];
                array[current] = array[current - 1];
                array[current - 1] = temp;
                current--;
            }
        }
    }
}
