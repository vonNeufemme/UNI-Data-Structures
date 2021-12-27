### 1. Algorithm A takes 1000n<sup>3</sup> steps and algorithm B takes 2<sup>n</sup> steps for a problem of size n. <br/>
For what size of problem is algorithm A faster than B (meaning algorithm A has fewer steps than B)?  

Algorithm A = 1000n<sup>3</sup>  
Algorithm B = 2<sup>n</sup>
<br>

**Asymptotic analysis**  
When the input for a specific algorithm gets bigger and bigger (Shaffer, 2012), how much will the number of steps (computations) required for the algorithm grow? Where does it go? To answer this question, we carry out the asymptotic analysis. Asymptotic analysis is a way to calculate the upper bound behaviour of the given algorithm, in other words, a way to measure its performance. 
Then let's analyse the asymptotes of the two algorithms to answer the discussion question. Which leads us to...
<br>

**The big O notation**  
Big O is a special notation used to express the algorithm's performance efficiency resulting from the asymptotic analysis. 

Then how do you calculate the Big O value? 
In simple terms, the highest-degree term in the algorithm's cost function is the Big O and the constants are generally ignored if there is any. 

- Algorithm A (cubic function) is of degree 3, which tells us that Algorithm A shows a cubic growth plus 1000 times greater due to the constant 1000. 
- Algorithm B (exponential funciton) is of degree n, meaning the degree will be growing as far as n grows, which is then doubled by constant 2. In other words, function 2 is an exponential function.

To visualise the problem, I drew graphs of the two functions. 

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit2%20asymptotic%20analysis1.png" width=600>

Graph 1 (left) shows that the cubic function grows at a much faster rate. Interestingly, it outpaces the rate of the exponential function just at over n = 1. Considering that n is the size of an input, we are only dealing with positive integers here. Having said that, the cubic function seems to defeat its exponential counterpart. 
Is it true in terms of infinity? No. 
To prove this, I ran a small experiment: if we compute the functions for a range of input sizes starting from 1, we can soon identify where the trend in the above graph above is reversed. 

      def expo(n):
          return 2**n

      def cubic(n):
          return (1000*n)**3

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit2%20asymptotic%20analysis3.png" width=600>

If we compute the functions for a range of input sizes starting from 0, we can soon identify where the trend in the graph above is reversed. 
For an input of size 46 or smaller, it is more efficient to use the exponential algorithm, and for an input of size 47 or greater, it is better with the cubic algorithm.


### 2. Give the upper bound (big O notation) that you can for the following code fragment, as a function of the initial value of n.

      for(int i = 0; i < n; i++) {
          for(int j = 0; j < i; j++){
              //do swap stuff, constant time
          }
      }


`i` is a group of serial integers bound to `n-1` (inclusive) : {0, 1, 2, 3, 4, .... n-1 }
`j` is another group of serial integers whose maximum number is just 1 smaller than `i`: {0, 1, 2, 3, 4 ... n-2}

For each value of incremental `i`, there will be a complete iteration over the entire array of `j` whose upper bound is `i`.
As the array index starts from 0, the upper bound value for `j` will be `i-1`, but the length will be the same, i. 
In other words, the i itself is the number of iteration for each incrementation of i. 

In mathematical formula, this will be: 1 + 2 + 3 + 4 + ... + i. 
This is factorial. The upper bound is O(n!)... which is the worst possible algorithm that there is. 

### Do you think that the lower bound is likely to be the same as the answer you gave for the upper bound?

Pretty much yes. Because the computational comparison shows that the factorial algorithm will be more efficient for an input of size only up to 3.
Afterwards (from input size 4 and onwards), the factorial algorithm gets all the factorially more costly.

<br> 

### References
Cliford A. Shaffer (2012) Data Structures and Algorithm Analysis Edition 3.2 (Java Version) https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf
