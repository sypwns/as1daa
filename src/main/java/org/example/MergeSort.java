package org.example;

public class MergeSort {
    private static final int INSERTION_SORT_THRESHOLD = 16;

    public static void sort(int[] arr) {
        int[] buffer = new int[arr.length];
        sort(arr, buffer, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int[] buffer, int left, int right) {
        if (right - left <= INSERTION_SORT_THRESHOLD) {
            insertionSort(arr, left, right);
            return;
        }
        int mid = (left + right) / 2;
        sort(arr, buffer, left, mid);
        sort(arr, buffer, mid + 1, right);
        merge(arr, buffer, left, mid, right);
    }

    private static void merge(int[] arr, int[] buffer, int left, int mid, int right) {
        // TODO: implement linear merge with buffer reuse
    }

    private static void insertionSort(int[] arr, int left, int right) {
    }
}