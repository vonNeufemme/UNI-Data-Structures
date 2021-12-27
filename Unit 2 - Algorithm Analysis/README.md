# Unit 2 Research Notes - Algorithm Analysis

<br>

## Key term & concepts

  - Correctness of algorithm
  - Efficiency of algorithm

  - upper and lower limits of variable types
  - mathematical overflow
  - type casting

  - Asymptotic algorithm analysis
  - growth rate: the rate at which the cost of the algorithm grows as the size of its input grows. 
    - linear growth: c * n (c for constant, n for size)
    - quadratic growth: highest-degree term is square.

<br>

## Reading Notes

3. Algorithm Analysis (AA)

**Use of AA**

- How would you know if any algorithm can meet the resource budget?

**Important factors for algorithm efficiency**

- Space resources
  - Main memory 
  - Disk space
- Time and space constraints

### Example 3.1 Largest value Sequential Search

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/Algorithm%20Analysis%20-%20Sequential%20Search%20ver1.png" width=500 />

**Sequential search runtime**

- T(n) = cn
  - n is the size of an array. 
  - c is the amount of time required to compare two integers in function `findLargest()`.
  - cn is the equation that compuates the growth rate for the running time of the largest value sequential search algorithm.

<br>

**Incrementing**

- T(n) = c * n^2
- takes constant time. 
- c = time

This means that: 
  - Computer will access RAM (Random Access Memory) for the data in constant time.
  - RAM is a string of bits (bytes - collection of 8 bits).
    - Word is how big of a memory chunk the CPU can take from RAM and operate on at a time. 
    - modern computers are 64-bits at the moment. 
  - CPU holds only small amount of information but it can change them. 

    "*Word "size" refers to the amount of data a CPU's internal data registers can hold and process at one time. Modern desktop computers have 64-bit words. Computers embedded in appliances and consumer products have word sizes of 8, 16 or 32 bits.* ([CPMac](https://www.pcmag.com/encyclopedia/term/word#:~:text=Word%20%22size%22%20refers%20to%20the,8%2C%2016%20or%2032%20bits.))"

### 3.2 Best, Worst, and Average Cases

    How about the worst case? The advantage to analyzing the worst case is that you know for certain that the algorithm must perform at least that well. This is especially important for real-time applications, such as for the computers that monitor an air traffic control system. Here, it would not be acceptable to use an algorithm that can handle n airplanes quickly enough most of the time, but which fails to perform quickly enough when all n airplanes are coming from the same direction (Shaffer, 2012).


### 3.3 A Faster Computer, or a Faster Algorithm?

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit2%20runtime%20comparison.png" width=500 />

### 3.4. 📈Asymptotic Analysis

In general, changes to a constant factor in either equation only shift *where* the two curves cross, not *whether* the two curves cross.
- The time curves for two algorithms with different growth rates still cross, regardless of their running-time equation constants.
- For these reasons, we usually ignore the constants when we want an estimate of the growth rate for the running time or other resource requirements of an algorithm.
- When comparing algorithms meant to run on small values of `n`, the **constant can have a large effect**.

*Asymptotic analysis is a form of “back of the envelope” estimation for algorithm resource consumption. It provides a simplified model of the running time or other resource needs of an algorithm.*

### 3.4.1. 📊 Upper Bounds

T(n) = true running time
f(n) = some expression for the upper bound

For T(n) a non-negatively valued function, T(n) is in set O(f(n))  if there exist two positive constants c and n<sub>0</sub> such that T(n) ≤ cf(n) for all n > n<sub>0</sub>.

There is no strict equality to the use of big-Oh notation. 
- O(n) is in O(n<sup>2</sup>), but O(n<sup>2</sup>) is not in O(n).

### 3.4.2 📉 Lower Bounds

<br>

Lower bound expressed with Omega shows the best case scenario for the algorithm.
How lowest is the complexity of the algorithm to solve a problem? That is, the minimum amount of work required to achieve the goal. 



## References
Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf
