## 🔳Quicksort algorithm

As the problem explains itself, quick sort is a divide-and-conquor algorithm, meaning that it divides the given list into smaller subsets (breaking the big problem into smaller chunks) first and sorts the small groups. In this process, we pick an item as `pivot` and sort the subset according to the value of this pivot. Everything smaller or equal to the pivot will go (be sorted) to the left side of the pivot, and the rest (bigger than the pivot) will go to the right. We repeat this process until there is only one or no item in the subset. When there is no more to sort, we simply merge all the sorted subsets from the left and right, and voila, our list has been sorted!

### ✴️The pivot
The pivot is an element in the list that the whole rest of the items will be sorted around. Just to make it a bit easier to understand, I would like to call it an axis or centre of the orbit if I can give it a different name. 

There are many different ways to select the pivot. For example:

(GeeksforGeeks, 2021) 

    1. Always pick first element as pivot.
    2. Always pick last element as pivot (implemented below)
    3. Pick a random element as pivot.
    4. Pick median as pivot.

### ❔why is the pivot important❓

The pivot is important because the efficiency of the sorting process can be affected by it. For instance, median as pivot seems more complicated because it adds two more steps to sorting each subset - namely, `add` (sum up the subset) and compute the median. However, because this approach will always divide the subset into exact halves, this can make the entire sorting algorithm more efficient as a whole than selecting a random item as a pivot. Picking a random pivot seems convenient, but the caveat of this approach is that it is vulnerable to the worst case scenario. Although highly unlikely, what if our random choice picks the smallest or biggest number as pivot each time? Then there will be almost no benefit for using this sorting algorithm as the operation will take n<sup>2</sup> steps.

<br>

### References

  - Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech.
  - GeeksforGeeks (2021) QuickSort https://www.geeksforgeeks.org/quick-sort/
  - Computerhile (2013) Quick Sort - Computerphile https://www.youtube.com/watch?v=XE4VP_8Y0BU&ab_channel=Computerphile
