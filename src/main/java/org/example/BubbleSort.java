package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2, 6, 7, 11, 5, 2, 33, 11, 9, 0};
        System.out.println("Unsorted array is: " + Arrays.toString(arr));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    public void sort(int[] array) {
        int n = array.length;
        boolean isSwapped;

        do {
            isSwapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwapped = true;
                }
            }
        } while (isSwapped);
    }
}
