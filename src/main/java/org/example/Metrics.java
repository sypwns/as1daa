package org.example;
// Metrics
public class Metrics {
    public static long comparisons = 0;
    public static long recursionDepth = 0;
    public static long allocations = 0;

    public static void reset() {
        comparisons = 0;
        recursionDepth = 0;
        allocations = 0;
    }
}