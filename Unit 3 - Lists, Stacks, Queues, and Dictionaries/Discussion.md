## Stack and Queue

1) the structure and function

Stacks and queues are special implementations of the array and linked-list structures. In the array, the structure had to be pre-defined (pre-sized) prior to creating the array even though you don't know how big it should be (Taipala, n.d.). Unlike array, linked list does not require the assignment of a list size upon initialisation. 

Likewise, stacks and queues do not require size definition upon creation. The common feature that these two data structure share is that they are a kind of resizable list where 
they can be freely scaled by inserting data items to them. This is performed by `push` (insert). Similarly, their size can be modified by removing some items. This is where stacks and queues exhibit differences from each other. Which brings us to ...

2) how they are different from each other in terms of their functions

The key difference between Stacks and Queueus are the order in which data items are inserted and removed. 

<img src="https://raw.githubusercontent.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/main/images/unit3%20enqueue%20dequeue.png" width=700 />

Let's discuss the Queue first. It was named after the nature of how human queueing practice works. Queue is essentially to give form and order to the 'first-come first-served' principle. So in Queue structure, data that gets first added occupies the first place, and the latter that comes, latter place, just like a queue - you stand at the tail of the queue as you arrive after those who have arrived earlier than you. When the data is processed, the first ones that have been waiting in the queue will be served first, which is also called FIFO (First In, First Out) structure. You can also observed this in the enqueue / dequeue operations shown in the Queue structure demo video above. 

<br>

Stack is largely similar to the Queue, except for the remove (`pop`) operation which is the `dequeue` in Queue. Unlike Queue, Stack has a LIFO (Last In, First Out) data structure wherein the data item inserted the last will be removed first. So for the convenience of visualising and understanding, it is often compared to the pile of plates. If we want to clear the plates off the table (let's say there are like a pile of 20 plates stacked on top of each other), we start clearing the stack from upside down, not the other way around. If you'd like to check my demo video above (do you see the message? ;-) ), it is the stack of words that say: hello Im stack. Even though the series of hello is the first to come in, it is the 'stack' part that gets popped first from the end to the start of the word (in the order of k - c - a - t - s). 

<br>

## References

Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf  

Taipala, D. (n.a.) CS 3303 Unit 3 Lecture 1  
Taipala, D. (n.a.) CS 3303 Unit 3 Lecture Part 2: Stacks and Queues  
