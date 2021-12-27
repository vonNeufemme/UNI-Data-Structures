# Unit 3 Research Notes - Lists, Stacks, Queues, and Dictionaries

[🖼️Image trove🌳](#https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/tree/main/images)


<br>

## Key term & concepts


<br>

## Lecture Notes

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit3%20Linked%20List%20vs%20Array.png" width=700 />

**Arrays**

- Size is fixed
- Easy to populate
- When all array positions are filled, no more data can be added.

- Advantages 
- Fast: can quickly create and access data. 
- Disadvantages 
  - fixed size: we need to know how large it is at the moment of creation
  - memory waste: because the size is fixed, unused array positions occupies and wastes memory

<br>

**Linked list**

- Advantages  
  - Scalability: the size is not fixed. Can grow as long as it wants.
- Disadvantages 
  - Difficult access: need to search through the pointers to find / access wnated data. Cannot access it directly.

<br>

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit3%20Stacks%20and%20Queues.png" width=700 />

Stacks and queues are special implementations of the array and linked-list structures.
In the array, the structure had to be pre-defined (pre-sized) prior to creating the array even though you don't know how big it should be :P .

**Stack (LIFO)**

LIFO: Last in, first out

- As you add items. you `push` them in, and they are added at last (Last in).

<br>

**Queue (FIFO)**

FIFO: first in, first out.

- The exact opposite of the stack. 
- First item we put in is the first one to be `pop`ped.

<br>


## Reading Notes

<br>

## Quiz

- A `linked list` implementation requires `static memory allocation` (static refers to pre-allocating all of the memory resource that will be used for the list)
- `Free list` holds the list nodes that are no longer in use.
- A `circular linked list` has no `Null` values in it.


<br>

## References
Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf
