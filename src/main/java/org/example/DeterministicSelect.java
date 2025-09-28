package org.example;
// Select
public class DeterministicSelect {
    public static int select(int[] arr, int k) {
        return select(arr, 0, arr.length - 1, k);
    }

    private static int select(int[] arr, int left, int right, int k) {
        // TODO: median-of-medians algorithm
        return -1;
    }

    private static int partition(int[] arr, int left, int right, int pivotIndex) {
        // TODO: partition in place
        return left;
    }

    private static int medianOfMedians(int[] arr, int left, int right) {
        return left;
    }
}