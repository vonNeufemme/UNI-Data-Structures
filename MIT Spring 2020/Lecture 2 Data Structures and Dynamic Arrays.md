# Lecture 2. Data Structures and Dynamic Arrays

## [📈Data Structures and Dynamic Arrays](https://www.youtube.com/watch?v=CHhwJjR0mZA&list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&index=2&ab_channel=MITOpenCourseWare)
<br>

All notes from: Instructor: Erik Demaine in the video. 

| Interface<br>(API / ADT) | Data Structure |
| ----------- | ----------- |
| - Specification<br>- what operations supported & what they mean | - Representation<br>- How to store data<br>- Algorithms to support operations |
| Problem | Solution | 

<br>

### Main interfaces

  - Set (order is **intrinsic**)
  - Sequence (order is **extrinsic**)

<br>

### 2 main DS approaches

  - Arrays
  - Pointer based 

<br>

### Static Sequence Interface: maintain a sequence of items x<sub>0</sub>, x<sub>1</sub>, x<sub>2</sub>, ... x<sub>n-1</sub> subject to these operations: 
  - build(X): make new DS for items in X.
  - len(): return n
  - iter_seq(): output x<sub>1</sub>, x<sub>2</sub>, ... x<sub>n-1</sub> in sequence order 
  - get_at(i): return x<sub>i</sub> (index i)
  - set_at(i, x): set x<sub>i</sub> to x

### Key: [word RAM model of computation](https://youtu.be/CHhwJjR0mZA?list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&t=566)
  
<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit2%20memory%20and%20array.png" />

  - memory = array of w-bit words 
  - "array" = consecutive chunk of memory

<br>

| (Natural) Solution | Desc |
| ----------- | ----------- | 
| Static array | - O(1) per `get_at`/`set_at`/`len`<br>- O(n) per `build`/`iter_seq` |
| Memory Allocation MOdel | - Allocate array of size n in &theta;(n) time |

<br>
 
    Assume w >= log(n)

<br>

### [🌙Static Sequences and ⚡Dynamic Sequencees](https://youtu.be/CHhwJjR0mZA?list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&t=1030)

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit2%20insert.png" />


| Dynamic Sequence Interface | Desc |
| ----------- | ----------- | 
| `insert_at(i, x)` | - make x the new x, shifting x<sub>i</sub> >> x<sub>i + 1</sub> >> x<sub>i + 2</sub> >> ... >> x<sub>n-1</sub> >> x<sub>n'-1</sub> <br> - (n'-1) = (n+1)<br>- `insert` first changes the index of all elements, in O(n) <br>- `insert` last does not change the computation load as in O(1) |
| `delete_at(i)` | - shift x<sub>i</sub> << x<sub>i + 1</sub> << x<sub>i + 2</sub> << ... << x<sub>n-1</sub> << x<sub>n'-1</sub>  << x<sub>n-1</sub> |
| `insert`/`delet_first`/`last(x)` | Species cases of inserting and deleting the head / tail |

<br>

### [📋Linked list](https://youtu.be/CHhwJjR0mZA?list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&t=1300)

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit2%20linked%20list.png" />
Image source: imgur

<br> 

### [Dynamic Sequence Array](https://youtu.be/CHhwJjR0mZA?list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&t=1553)

- Static array is really bad for dynamic sequence operations 
1) Shifting
2) Allocating/copying
3) `Insert`/`delet_first` will be in constant time in constrast to the static sequence.
4) However, everything else will be O(n) because the operation will have to follow the pointer.
  - `get`/`set_at`: &theta;(n)

Q. How would you `get_last` in constant time in dynamic sequence?

<img src="https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/blob/main/images/unit2%20dynamic%20get_last.png" width=600 />

You have to maintain and update the `tail` pointer. Then the operation to `get_last` in linked list will be faster.
  - If this is the case, however, maintaining and updatining the pointer itself is a job itself. 
  - Although the updating will be constant (O(1)) each time, wouldn't the sum of the work across time be linear (O(n))?
  - The advantage is, though, this approach distributes the workload across time so it wouldn't exceed the  memory capacity at a single given time.

<br>

### Amortised time 

- Operation takes T(n) amortised time if any k operations take <= k * T(n) time.

"*Amortized time is the way to express the time complexity when an algorithm has the very bad time complexity only once in a while besides the time complexity that happens most of time. Good example would be an ArrayList which is a data structure that contains an array and can be extended.* ([Sasozaki 2016, medium](https://medium.com/@satorusasozaki/amortized-time-in-the-time-complexity-of-an-algorithm-6dd9a5d38045))" 

<br>

| Data Structure | Operation, Worst Case O (.) | |||
| -------------- | ------- | --------- | --------- |--------- |
|  | Static  | Dynamic | --------- | --------- |
| | `get_at(i)` | `insert_first(x)` | `insert_last(x)` | `insert_at(i, x)` |
| | `set_at(i, x)` | `delete_first(x)` | `delete_last()` | `insert_at(i)` |
| Array | 1 | n | n | n |
| Linked List | n | 1 | n | n |
| Dynamic Array | 1 | n | 1<sub>(a)</sub> | n |

<br>

**References**
MIT OpenCourseWare (2021) 1. Algorithms and Computation https://www.youtube.com/watch?v=ZA-tUyM_y7s&list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&index=2&ab_channel=MITOpenCourseWare
MIT OpenCourseWare (2021) 2.Data Structures and Dynamic Arrays https://www.youtube.com/watch?v=CHhwJjR0mZA&list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&index=2&ab_channel=MITOpenCourseWare
