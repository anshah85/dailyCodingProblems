package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2, 6, 7, 11, 5, 2, 33, 11, 9, 0};
        System.out.println("Unsorted array is: " + Arrays.toString(arr));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
