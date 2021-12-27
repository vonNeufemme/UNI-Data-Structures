# Unit 5 Research Notes - Non-binary Tree

[🖼️Image trove🌳](#https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/tree/main/images)


<br>

## 🔑Key term & concepts

  - Red-Black Tree ♥️♠️🌳
  - Sequential Tree
  - Path Compression
  - List of Children
  - Weighted Union Rule


<br>

## Lecture Notes

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit3%20Linked%20List%20vs%20Array.png" width=700 />

**Some foundational concepts for balanced searcht ree**

- Guaranteed height of O(log n) for n times.


### **Red-black Tree♥️♠️🌳**

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unti5%20red-black%20tree.png" width=700 />

- Self-balancing binary search tree
- Each node has an extra **_storage bit**_, which represents its color (<span style="color:red">red</span> or black)
- **Properties**
  - A node is either <span style="color:red">red</span> or black.
  - Root and leaves (NIL) are always black.
  - External property: every external node is black.
  - <span style="color:red">Red</span> property: the children of <span style="color:red">red</span> nodes are black.
  - Depth: all external nodes have the same black depth.  
    👉 All paths from a node to its NIL descendants contain the same # of black nodes.    
    👉 When counting the black nodes in the path, we don't count the starting node.  
    👉 **Black-height** of the red-black tree  
- The longest path (root to farthest NIL) is no more than twice the length of the shortest path (root to nearest NIL)   
    👉 Shortest path: all black nodes
    👉 Longest path: alternating <span style="color:red">red</span> and black
- Time complexity  
    👉 Search O(log n)
    👉 Insert O(log n)
    👉 Remove O(log n)
- Space complexity  
    👉 Search O(n)
   
<br>

### **N-ary Tree🌳**

- **Properties**
  - M-ary tree: a rooted tree🌳 whose every vertex has no more than m children.
  - Full m-ary tree: every vertex has exactly m children.
  - Binary tree: an m-ary tree with **m = 2**
  - Balance: an m-ary tree of height _**h**_ is _**balanced**_ if all leaves are at level _**h**_ or _**h-1**_.
  - Theorem: the number of leaves in an _**m**_-ary tree of height _**h**_ is at most _**m<sup>h</sup>**_.

<br>

### Union-Find

- a data structure that keeps track of elements which are split into one or more disjoint sets.
- Has 2 primary operations: `find` and `union`.
- Applications
  - Kruskal's minimum spanning
  - tree algorithm
  - Grid percolation
  - Network connectivity
  - Least common ancestor in trees
  - Image processing



❗Thoughts notes📔
- The height of a tree is _**edges**_ not vertices because the root is always 1, which is 2<sup>0</sup>, so we need a way to express h-1. The number of edges are always 1 lesser than that of the vertices, hence count edges.

<br>

## Reading Notes

6.1 General Tree Definitions and Terminology

- parent pointer: Perhaps the simplest general tree implementation is to store for each node only a pointer to that node’s parent.
  - Use: maintain a collection of disjoint sets
  - Disjoint sets: In mathematics, two sets are said to be disjoint sets if they have no element in common. Equivalently, two disjoint sets are sets whose intersection is the empty set ([Wikipedia](https://en.wikipedia.org/wiki/Disjoint_sets)). 

- **Equivalence class**: a way of grouping / organising elements in a relation

<br>

**Fundamental concept of node**

Node consists of: 

1. data
  2. memory address
  3. reference


Gemeroc tree: eacj node can have any number of branches. 

<br>

6.1.1 An ADT for General Tree Nodes 206

<br>

6.1.2 General Tree Traversals 207

<br>

6.2 The Parent Pointer Implementation 208

<br>

6.3 General Tree Implementations 216

<br>

6.3.1 List of Children 217

<br>

6.3.2 The Left-Child/Right-Sibling Implementation 218

<br>

6.3.3 Dynamic Node Implementations 218

<br>

6.3.4 Dynamic “Left-Child/Right-Sibling” Implementation 220

<br>

6.4 K-ary Trees 221

<br>

6.5 Sequential Tree Implementations


<br>

## Quiz


<br>

## References
Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf

<Br>
  
### Video

- MisterCode (2016) Red-Black Trees - Data Structures https://www.youtube.com/watch?v=ZxCvM-9BaXE&ab_channel=MisterCode   
- Michael Sambol (2016) Red-black trees in 4 minutes — The basics https://www.youtube.com/watch?v=qvZGUFHWChY&ab_channel=MichaelSambol   
- Dr Belorkar (2020) Lecture 25 (Part 3) - Section 11.1 - M-ary trees https://www.youtube.com/watch?v=VLcD9ky51GQ&ab_channel=freeCodeCamp.org   
  
