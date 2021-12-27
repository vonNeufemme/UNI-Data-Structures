# Lecture 8. Binary Heaps

## [📈 Binary Heaps](https://www.youtube.com/watch?v=Xnpo1atN-Iw&ab_channel=MITOpenCourseWare)

<br>

All notes from: professor. Erik Demaine in the video. 

### `Priority Queue` interface (subset of Set)
- `build(x)`: init. to items in `X`
- `insert(x)`: add item `x`
- `delete_max(x)`: delete & return max-key item
- `find_max()`: return max-key item

<br>

### Heaps
- Priority queue interface & sorting algorithm
- Set AVL tree >> [AVL](https://en.wikipedia.org/wiki/AVL_tree) sort (AVL - Adelson-Velsky and Landis, a self-balancing binary search tree)



| Priority Queue<br>Data structure | Operations O(.) | | | Priority Queue Sort | | |
| ----------- | ----------- | ----------- | ----------- | ----------- | ----------- | -- |
| ----------- | `build(A)` | `insert(x)` | `delete_max()` | n<sup>2</sup> | in-place? | |
| Dynamic Array | n | l<sub>(a)</sub> | n | n<sup>2</sup> | Y | selection sort | 
| Sorted Dynamic Array | n log n | n | l<sub>(a)</sub> | n<sup>2</sup> | Y | insertion sort |
| Set AVL Tree | n log n | n log n | n log n | n log n | N | AVL sort |
| **Goal**  | n | log n<sub>(a)</sub> | log n<sub>(a)</sub> | n log n | Y | Heap sort |

<br>

**Array (selection sort)**  
  - `insert` is fast O(1) 
  - `delete` is slow because we don't know where the value is. Need to scan through the array; 
  - `delete_max()`: linear time O(n)

**Sorted Array (insertion sort)**  
  - `delete_max()`: is fast, always the last. O(1)
  - `insert()`: is linear; it needs to scan through the array to find the position. O(n) 

In general, priority queue sort is inefficient because the operations take linear time so it is not ideal for sorting algorithm.  
In addition to the array itself, we constantly need the updated data of the pointer and indices.

**Heap**  
  - `insert(x)` for x in A (build(A))
  - repeatedly `delete_max()`
  - T.build(n) + T.delete_max <= n(T.insert + T.delete_max)

  
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Max-Heap-new.svg/800px-Max-Heap-new.svg.png" />

<img src="" />
<br>

**References**
MIT OpenCourseWare (2021) 8. Binary Heaps https://www.youtube.com/watch?v=Xnpo1atN-Iw&ab_channel=MITOpenCourseWare
