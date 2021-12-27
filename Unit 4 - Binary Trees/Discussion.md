
## Binary Tree

**Root, Node, Sub-Tree, Height, Depth, and Leaf**  

🎄 🌳 🌲 🌴  

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit4%20binary%20tree.png" width=800 />

<br>

1) Definition  

Binary tree 🎄 is a data structure in which data is stored in a tree-like hierarchy. In 🎄 tree structures, data items are called **node 🎱**, which is the same as elements in arrays or lists. The first item of the tree 🎄 is called root, which sits on top of the rest of nodes. In the figure above, M is the root as it is on the highest level of the tree, above the rest of the nodes. 

**Sub-tree** is a set of subsets of all partial trees that can come out of the given tree. In my example.... I counted 14. How many do you see? Let me know (lol).

**Height** and **depth** are two important concepts to understand the structure of the tree. The depth is the number of edges from the leaf node (terminal node which hangs at the bottom of the tree without any child nodes hanging on it) all the way up to the root node. So in this example, the depth is 6. On the other hand, the height is the number of edges from a specific node down to the farthest terminal node, so knowing the height we can locate the level at which a node sits. The height of F is 4 (from F to the farthest F). Depth and height are important information as they allow us to locate where certain nodes are faster.

Lastly, nodes are also called ancestor - descendants, or parent - children. These terms describe the relationship between nodes: which nodes are branching out of which node. O and S are branching out of P, so P is the parent of children O and S.

<br>

2) Implmentation

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit4%20binary%20tree2.png" width=250 />

In binary tree implementation, each node of the tree consists of class Node, and each Node has integer value and two childrend Nodes called left and right as its attributes. Each time we want to add a value to a binary tree, we can implement this by creating a new node and storing the value in it. And if the given node already holds value, we can create a new Node and store it right there. In this process, we can let the code to determine whether this value should be stored in the left or right Node by comparing it to the current Node's value. 

Lastly, according to Shaffer (2011), there are several useful applications of binary trees in real world situations. Which include:

  - prioritizing jobs
  - describing mathematical expressions and the syntactic elements of computer programs
  - organizing the information needed to drive data compression algorithms

I'm currently working in data analysis, and the binary tree is a useful algorithm in making decisions or identifying most important sub datasets.

<img src="https://raw.githubusercontent.com/Coding-Forest/2021-Data-Analysis/main/Datasets/01-08%20DecisionTree%20-%20DecisionTree%20graph.png" width=700 />

This decision tree algorithm also implements the concepts of the binary division and depths, and it's 4 level deep.


<br>

### References

Shaffer, C. (2011) A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf

Behzad Ahmad (n.d.) What is the difference between the height and depth of a tree? https://www.educative.io/edpresso/what-is-the-difference-between-the-height-and-depth-of-a-tree

Marcos Lopez Gonzalez (2012) Implementing a Binary Tree in Java https://www.baeldung.com/java-binary-tree
