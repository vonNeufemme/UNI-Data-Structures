Buffers are block of memory in the primary storage. The computer writes certain pieces of data used in the main memory to avoid accessing the secondary storage each time and thus to increase the performance speed. The group of buffers managed by file manager is called buffer pool. Although highly helpful and practical in managing the data handling performance, there are limits to how many buffers the buffer pool can manage and the computer should delete (replace) buffers with other data when the buffer gets full. Which leads us to the discussion of the following:

### FIFO

**1. Heuristic mechanism.**

This heuristic is a practical use case of the FIFO algorithm. The buffers are queueed up in the buffer pool. As the pool gets full so some buffers have to be replaced, it will be the first buffers that filled the pool that will be removed first; buffers that were first in are out first. 

**2. Inefficiency of FIFO **

(Under what condition will this heuristic not be efficient? In this context an efficient buffer, is one that has the highest potential to provide a block of data out of the buffer and not have to go back to disk. In your answer consider whether this heuristic is the most effective approach is the value 5 is used more frequently than any other value.)

Buffer pool management is like a lottery game. In a way, the replacement algorithm is trying to pick the buffer that is least useful so it can keep the data that are most useful and frequently used in the pool. FIFO will be inefficient in cases where you have to loop through the same dataset for a given number of times. (Let's say you have to look up a list of 100 people's contact numbers in a phone book 10 times for some reason and your pool size is 10) You will have to look up the same person againm after going through the other 99 people, and your pool can keep the contacts of 10 people only, so you will actually never benefit from the buffer pool.


**3. Efficiency of FIFO**

(Describe a situation where this heuristic would be efficient. For a hint think about read-ahead capabilities.)
Theoretically speaking, this would be useful if you have to look up the data most recently cached in the buffers multiple times before having to access the disk again. 

<br>

### LRU

**1. Heuristic mechanism**

Least recently used heuristic is similar to the FIFO heuristic. However, the crucial difference between them lies in that the LRU replaces the age of the buffers are determined by the usage frequency. This means that if the oldest data is accessed frequently, its age will be reset. Therefore, one can say that the buffers enter into an age competition to sit in the pool where the least used buffer may be the oldest one to be replaced even if it entered the pool most recently. 

**2. Inefficiency of LRU**

Buffers that are not frequently used but important may out-age the ones that are not important as much but more frequently used. 

**3. Efficiency of LRU**

This would be useful if the programme needs to access a batch of data many times and handle multiple batches in the same way.

<br>

### LFU

**1. Heuristic mechanism**

Least frequently used hueristic replaces the buffer that is used the least times.

**2. Inefficiency of LFU** (shaffer, 2011)

1) The assumption of this heuristic is that the least used buffer is the least important. But this may not be the case. 
2) it has to keep counts of each buffer, which is extra data to handle. 
3) As it is count-based, data of little importance will continue to occupy the buffer if they happen to maintain just the threshold frequency count. 

**3. Efficiency of LFU**

... (even the text book doesn't mention the efficiency of LFU. I wouldn't know... 👀)

<br>

### References
  
  - Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech.
  - OpenDSA (n.d.) 9.4. Buffer Pools https://opendsa-server.cs.vt.edu/ODSA/Books/CS3/html/BuffPool.html
