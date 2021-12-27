# Unit 4 Research Notes - Binary Tree 🌳

[🖼️Image trove🌳](https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/tree/main/images)

<br>

## Key term & concepts

**Concepts**  

- Balancing the tree 🌳🌳🌳
  - `AVL`
  - `2-3-4`
  - `Red-Black`
<br>

**Terms**   

Tree structure:

  - Root
  - Node 
  - Parent👪 - child👩‍👧‍👦 (Ancester - descendant)
  - Sub-Tree🌴
  - Depth (root node doesn't count)
  - Height (root node counts)
  - Leaf🍂

Tree traversal:

  - Pre-order
  - In-order
  - Post-order:
  - Breadth-first:

<br>

## 📓👂 Lecture Notes 

Tree balance is achieved often by rotating tree leaves (nodes).
  - = shifting, exchanging or rotating the nodes to reduce the depth. 

  - Pre-order
  - In-order
  - Post-order:
    - It performs depth-by-depth (layer) visits. So it first visits all the nodes in the same layer (depth) then moves up or down to change the level (i.g. depth, layer)
    - `Root` is the last node to be visted

<br>


## 📓👀 Reading Notes 

Application of trees 🌳🌳🌳  

  - prioritizing jobs
  - describing mathematical expressions and the syntactic elements of computer programs
  - organizing the information needed to drive data compression algorithms

Tree structure: 

- The root is at level 0, depth 0.
- Height = depth + 1

**full binary tree**  

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit4%20full%20complete%20binary%20tree.png" width=700 />

image from Shaffer (2011)

(1) an internal node with exactly two non-empty children or a leaf.

(2) A complete binary tree has a restricted shape obtained by starting at the root and filling the tree by levels from left to right.

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit4%20" width=700 />
<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit4%20" width=700 />
<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit4%20" width=700 />

Theorem 5.1 Full Binary Tree Theorem: The number of leaves in a non-empty full binary tree is one more than the number of internal nodes  
Theorem 5.2 The number of empty subtrees in a non-empty binary tree is one more than the number of nodes in the tree.


<br>


## ❓Quiz

_**A binary tree traversal that lists every node in the tree exactly once is called:**_  
❓ Are these concepts all related to binar tree...?  
- Traversal
- visitor design pattern
- An enumeration
- Natural ordering sequence

<br>


**_Correctly identify the following heap structure by selecting the best answer:_**  
❓ Hmmm...?  
- Partially ordered heap
- Max-heap structure
- Priority heap
- Min-heap structure

<br>

## Peer Discussion 

**Logarithmic properties of Binary Tree**

  - The logarithmic speed of a binary tree can be maintained by _**balancing the tree**_.
  - Tree rotations ensure the O(log N) search speed (preventing it from the speed increasing to O(n)). 
  - If this specific property of a binary tree is lost, it is technically a Linked List (`search` / `insert` / `delete` speed will decrease). 
    - `search`, `access`, `insert` and `delete` in logarithmic time O(log n)
    - `binary tree` is much faster than an `array` at `search`, `insert`, and `delete` O(log n) <  O(n)


<br>

## References   
Shaffer, C. (2011) A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf


## Videos  
Taipala. D. (20??) CS 3303 Unit 4 Lecture Part 2: Balanced Binary Search Trees  
MIT OpenCourseWare (2021) 6. Binary Trees, Part 1 https://www.youtube.com/watch?v=76dhtgZt38A&ab_channel=MITOpenCourseWare  
