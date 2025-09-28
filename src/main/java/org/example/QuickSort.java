package org.example;

import java.util.Random;

public class QuickSort {
    private static final Random rand = new Random();

    public static void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int left, int right) {
        while (left < right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex - left < right - pivotIndex) {
                quicksort(arr, left, pivotIndex - 1);
                left = pivotIndex + 1; // tail recursion elimination
            } else {
                quicksort(arr, pivotIndex + 1, right);
                right = pivotIndex - 1;
            }
        }
    }

    private static int partition(int[] arr, int left, int right) {
        return left;
    }
}