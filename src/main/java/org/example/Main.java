package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        MergeSort.sort(arr);
        for (int v : arr) System.out.print(v + " ");
    }
}