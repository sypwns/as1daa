```markdown
# Divide and Conquer Algorithms in Java

## 1. Introduction

This project implements several classic **divide-and-conquer algorithms** in Java.  
The main goals were to:

- Practice safe recursion patterns.  
- Collect performance metrics (time, recursion depth, comparisons, allocations).  
- Analyze running-time recurrences using the **Master Theorem** and **Akra–Bazzi method**.  
- Validate theoretical predictions with practical measurements.  

The repository was structured using **feature branches**, proper commit history, and release tags (`v0.1`, `v1.0`) to follow a professional Git workflow.

---

## 2. Implemented Algorithms

- **MergeSort**
  - Optimized with buffer reuse and cutoff to insertion sort.
  - Implements divide–conquer–combine paradigm.

- **QuickSort**
  - Uses randomized pivot selection.
  - Recursion optimized by processing smaller partition first to reduce depth.

- **Deterministic Select (Median of Medians)**
  - Guarantees linear worst-case running time.
  - Compared against sorting-based selection.

- **Closest Pair of Points**
  - Divide-and-conquer algorithm with *O(n log n)* complexity.
  - Verified against brute-force solution for correctness.

- **Metrics Utility**
  - Tracks recursion depth, number of comparisons, and allocations.
  - Exports results in **CSV** format for analysis.

- **CLI (Command-Line Interface)**
  - Runs algorithms with arguments.
  - Collects performance metrics and outputs results.

---

## 3. Workflow and Git Usage

The project followed a **branch-based workflow**:

- `main` – only stable releases.  
- `feature/*` – separate development branches for each algorithm/module.  
- `refactor/util` – common utility methods.  

**Tags:**
- `v0.1` → initial working version (Maven setup, JUnit tests, README).  
- `v1.0` → stable release with all algorithms, metrics, and CLI.  

**Example Commit Messages:**
```

feat(mergesort): baseline + cutoff optimization
feat(metrics): counters, depth tracker, CSV writer
refactor(util): add swap and shuffle helpers
release: v1.0

```

---

## 4. Theoretical Analysis

**MergeSort:**
```

T(n) = 2T(n/2) + O(n) → O(n log n)

```

**QuickSort:**
```

Best/Average: T(n) = 2T(n/2) + O(n) → O(n log n)
Worst:        T(n) = T(n-1) + O(n) → O(n²)

```

**Deterministic Select (MoM5):**
```

T(n) = T(n/5) + T(7n/10) + O(n) → O(n)

```

**Closest Pair of Points:**
```

T(n) = 2T(n/2) + O(n) → O(n log n)

```

---

## 5. Experimental Validation

- Metrics collected: **running time, recursion depth, comparisons**.  
- Data exported as CSV and plotted into graphs.  
- Observations matched **Master Theorem** predictions.  
- QuickSort with randomized pivot significantly outperformed the worst-case.  
- Deterministic Select was slower in practice than randomized selection but still confirmed linear complexity.  

---

## 6. Conclusion

The project demonstrated the efficiency of **divide-and-conquer algorithms** and how **theory matches practice** when measured carefully.  
The structured Git workflow ensured professional project management with reproducible versions.

### 🔮 Future Improvements
- Extend metrics with memory usage tracking.  
- Add **parallel implementations** for multi-core speedups.  
- Introduce more detailed **JMH benchmarking**.  
```
