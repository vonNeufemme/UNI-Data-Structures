

In my understanding, this is a depth-first binary search tree. Although, I must comment that 5 nodes are a small number for a tree size and there is a plenty of room that the traversal behaviour may change if we had more nodes. 

Largely, there are 3 types of traversals when it comes to binary trees. Each node in a binary tree consists of a node with two children (left and right). So when traversed, the process visits either the node itself, its left child, or its right child in a certain order. All the three traversals below visits each node from left to right.

  - **Pre-order traversal**: visits the node first then goes left and right. NODE - left, right
  - **In-order traversal**: passes the node, visits the left child first. so the order is: left - NODE - right
  - **Post-order traversal**: passes the node, visits the left and right first then itself. left - right - NODE. Visits the node only when both its children have been visited first.
  I ran the code in Jeliot, and according to console output, it should be the in-order. 

In case of the asymptotic analysis, I still find it hard to produce an analysis myself. I found some helpful article and it says the analysis is O(n). I will leave the link below. 

<br>


### A fun fact - What are the key concepts of Unit 5?   

Warning, off-topic extra notes

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit5%20key%20concepts1.png" />

I just started working as a data engineer, and I do natural language data processing. Out of curiosity, I ran a simple programme to see which words were most frequently appearing in our reading assignment for week 5. The wordcloud algorithm visits every single word in the text (which is stored in the form of a list of words), registers each new word to a dictionary as a key with a value of 1, and increments the value each time the algorithm comes across the same word (key). So it's kind of similar to the asymptotic analysis of tree traversal as it is O(n). The size of the word reflects the frequency of the word. The bigger the word is, the more frequently it appears across the chapter. But this is quite a boring and predictable analysis, because this week's topic is about non-binary trees, so concepts like node and tree are guaranteed to appear. So I removed the top-10 most frequent words: 

  - `['tree', 'node', 'trees', 'nodes', 'general', 'children', 'child', 'root', 'implementation', 'array']`

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit5%20key%20concepts2.png" />

Pointer turns out to be the next-most frequent concept. Which I agree as tree structures are special implementations of linked list, and the pointer is a principal component that enables the implementation of other forms of tree structures. Does the second word cloud match your learning for this week? 

Thank you!

<br>

### **References**

  - Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf
  - Subham Datta (2021) What Is the Time Complexity of Tree Traversal? https://www.baeldung.com/cs/tree-traversal-time-complexity
  - Duong Vu (2019) Generating WordClouds in Python https://www.datacamp.com/community/tutorials/wordcloud-python
