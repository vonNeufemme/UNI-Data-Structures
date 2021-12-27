# <span id="top">Unit 1 Research Notes</span>

<br> 

## Reading Notes

[1.1 A Philosophy of Data Structures](#philosophy)  
[1.1.1 The Need for Data Structures](#need)    
[1.1.2 Costs and Benefits ](#costs)   
[1.2 Abstract Data Types and Data Structures](#adt)      
[1.3 Design Patterns](#designpattern)    
[1.3.1 Flyweight](#flyweight)     
[1.3.2 Visitor](#visitor)  
[1.3.3 Composite](#composite)  
[1.3.4 Strategy](#strategy)  
[1.4 Problems, Algorithms, and Programs](#problems)  
[1.5 Further Reading](#reading)  
[1.6 Exercises](#exercise)  

<br>

## <span id="philosophy">1.1 A Philosophy of Data Structures</span>

  - Representing information is fundamental to computer science

**Steps to select data structure to solve a problem:**  
  1. Analyze your problem to determine the basic operations that must be supported. Examples of basic operations include inserting a data item into the
  data structure, deleting a data item from the data structure, and finding a
  specified data item.
  2. Quantify the resource constraints for each operation.
  3. Select the data structure that best meets these requirements.


<br>

## <span id="need">1.1.1 The Need for Data Structures</span>


<br>

## <span id="cost">1.1.2 Costs and Benefits </span>

we see that a data structure that has little concern for the cost of deletion, but is highly efficient for search and moderately efficient for insertion, should meet the resource constraints imposed by this problem. Records are accessible by unique account number (sometimes called an exact-match query).

### **Hash table**
Hash tables allow for extremely fast exact-match search. 
  - A record can be modified quickly when the modification does not affect its space requirements. 
  - Hash tables also support _efficient insertion of new records_. 
  - While deletions can also be supported efficiently, too many deletions lead to some degradation in performance for the remaining operations.
    - However, the _hash table can be reorganized_ periodically to restore the system to peak efficiency. 
    - Such reorganization can occur offline so as not to affect ATM transactions.



<br>

## <span id="adt">1.2 Abstract Data Types and Data Structures </span>
- two traditional implementations for the list data type: the linked list and the array-based list. The list data type can therefore be implemented using a linked list or an array.
- “Array”: a contiguous block of memory locations, where each memory location stores one fixed-length data item.
  - an array is **_a physical data structure_**.
  - However, array can also mean a **_logical data type_** composed of a (typically homogeneous) collection of data items, with each data item identified by an index number.

### Hashing and tree 
- Two popular implementations for large disk-based database applications are hashing (Section 9.4) and the B+-tree (Section 10.5). 
- Both support efficient insertion and deletion of records, and both support exactmatch queries. 
  #### Hashing
  - However, hashing is more efficient than the B+-tree for exact-match queries. 
  #### B+ tree
  - On the other hand, the B+-tree can perform range queries efficiently, while hashing is hopelessly inefficient for range queries.
  
Thus, if the database application limits searches to exact-match queries, hashing is preferred. On the other hand, if the application requires support for range queries, the B+-tree is preferred. Despite these performance issues, both implementations solve versions of the same problem: updating and searching a large collection of records.



<br>

## <span id="designpattern">1.3 Design Patterns </span>

<img src="https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/blob/main/images/unit1%20datatype.png" width=450/>

#### **Design Patterns**
- Various resuable techniques for combining software components

<br>

### <span id="flyweight">1.3.1 Flyweight </span>
The various instances of references to “C” are called flyweights. A flyweight includes the reference to the shared information, and might include additional information specific to that instance.

What is it? 
Flyweight pattern is a design pattern that optimises the code. 
- Used when we need to create a laaaaaaaarge number of similar objects. ⏰🌐🥑🦡🏸

Why is it necessary? 
- When we have a lot of objects, what we want to do is to reduce the number of instances because the parent objects occupy a lot of memory slots. 
- Designed to share objects 
- Flyweight aims to reduce the memory resource used by functional component (in comparison to the static assets like icon)

[[🏀Exercise 1]](https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/tree/main/Code%20exercises/Design%20Pattern%20-%20Flyweight%202%20Draw%20shapes)

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/Code%20exercises/Design%20Pattern%20-%20Flyweight%202%20Draw%20shapes/drawShapes%20-%20flyweight.png" width=400/>

<br>

Code Source: Derek Banas (2012) Flyweight Design Pattern https://www.youtube.com/watch?v=0vV-R2926ss&t=213s&ab_channel=DerekBanas

<br>

<img src="https://refactoring.guru/images/patterns/content/composite/composite.png?id=73bcf0d94db360b636cd" width=500 /> image from: https://refactoring.guru/design-patterns/composite

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit1%20composite.png" width=500 /> image from: Derek Banas (2012)

- Flyweights are used in the implementation for the PR quadtree data structure for storing collections of point objects.
- Many of the leaf nodes in the tree structure with numerous object instances represent empty areas, and so the only information that they store is the fact that they are empty.
  - These identical nodes can be implemented using a reference to a single instance of the flyweight for better memory efficiency.


<br>

### <span id="visitor">1.3.2 Visitor </span>


We could write a separate traversal function for each such activity that we intend to perform on the tree. A better approach would be to write a generic traversal
function, and pass in the activity to be performed at each node. This organization constitutes the visitor design pattern.


<br>

### <span id="composite">1.3.3 Composite </span>


<br>

### <span id="strategy">1.3.4 Strategy </span>


<br>

## <span id="problem">1.4 Problems, Algorithms, and Programs </span>

  - **Problem**: a problem is a task to be performed.
  - **Algorithms**: a method or a process followed to solve a problem.
    - If the problem is viewed as a function, then an algorithm is an implementation for the function that transforms an input to the corresponding output.
<br>

### Properties of algorithm
1. Must be correct 
2. Concrete steps 
  - steps are completely understood and doable.
  - executable within a finite amount of time
3. No ambiguity
  - which step will be performed next?
4. A finite number of steps
5. It *terminates*.

To summarise: A **problem** is a function or a mapping of inputs to outputs. An **algorithm** is a recipe for solving a problem whose steps are concrete and unambiguous. Algorithms must be correct, of finite length, and must terminate for all inputs. A **program** is an instantiation of an algorithm in a programming language.

<br>

## <span id="reading">1.5 Further Reading </span>



<br>

## <span id="exercise">1.6 Exercises</span>


<br>



## <span id="math">2 Mathematical Preliminaries</span>

### keywords and concepts 
  - antisymmetry

2.1 Sets and relations
  - **bag**: A collection of elements with no order (like a set), but with duplicate-valued elements
  - **sequence ( = tuple or vector)**: a collection of elements with an order, and which may contain duplicate-valued elements.
  - **relation R over set S**: a set of ordered pairs from S.

  • R is reflexive if aRa for all a ∈ S.
  • R is symmetric if whenever aRb, then bRa, for all a, b ∈ S.
  • R is antisymmetric if whenever aRb and bRa, then a = b, for all a, b ∈ S.
  • R is transitive if whenever aRb and bRc, then aRc, for all a, b, c ∈ S.


<br>
