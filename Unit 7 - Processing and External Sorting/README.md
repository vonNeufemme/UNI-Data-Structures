# Unit 7 Research Notes - Processing and External Sorting

[🖼️Image trove🌳](https://github.com/Coding-Forest/UoP-2021-3303-09-Data-Structures/tree/main/images)

<br>

## 🔑Key term & concepts

  - Primary vs. secondary storage💽
  - 💾Disk drives: 🏛️architecture and access costs💰 
  - Buffers, Buffer Pools🏊‍♀️ & buffer cache
  - External Sorting 
  - File structure🗃️🗄️

<br> 

  - dirty bit
  - buffer pool heuristics 


<br>

## Lecture Notes

Problem 1. How the DBMS represents the database in files on disk.
Problem 2. How the DBMS manages its memory and move data back-and-forth from disk.

<br>

**Spatial control**

  - Where to write pages on disk. 
  - The goal is to keep pages that are used together often as physically close together as possible on disk.

<img src="https://raw.githubusercontent.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/main/images/unit7%20buffer%20pools%20access%20time.png" width=700 />  
Andrew Crotty (2021), Carnegie Melon University

<br>

**Temporal control**
  
  - When to read (fetch) pages into memory, and when to write thme to disk. 
  - The goal is to minimise the number of stalls from having to read data from disk.  
 
<br>

### Virtual Memory (VM)
  
  All lecture slides by David Black-Schaffer
  
  A layer of **indirection**  
  (In computer programming, indirection (also called dereferencing) is the ability to reference something using a name, reference, or container instead of the value itself. The most common form of indirection is the act of manipulating a value through its memory address.)

  Without Virtual Memory  
   - Programme address = RAM address  

<img src="https://raw.githubusercontent.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/main/images/unit7%20buffer%20pools%20disk-oriented%20DBMS.png" width=700 />  

<br>

<img src="https://raw.githubusercontent.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/main/images/unit7%20virtual%20memory.png" width=700 />

<br>

<img src="https://raw.githubusercontent.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/main/images/unit7%20virtual%20memory%20indirection%20mapping.png" width=700 />

Fetching data from disk instead of memory

  - Worse performance: it is 1000x slower than RAM. This performance penalty costs your time. 
    - Buy more RAM if you can afford it.

<br>

<img src="https://github.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/blob/main/images/unit7%20virtual%20memory%20RAM%20mapping.png?raw=true" width=700 />

<br>

<img src="https://raw.githubusercontent.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/main/images/unit7%20virtual%20memory%20programme%20isolation.png" width=700 />

<br>

<img src="https://github.com/Coding-Forest/UNI-2021-3303-09-Data-Structures/blob/main/images/unit7%20CPU%20RAM.png" width=700 />

Image from Max's Tech (2018) 

<br>

<img src="" width=700 />
<img src="" width=700 />

<br>

## Reading Notes

### **Unit 7. Introduction**

1. The FIFO heuristic will be effective for data that tends to be more sequential and becomes less useful with age.
2. The **LRU** heuristic is most effective when some data is used frequently and must be maintained in the buffer regardless of its age.
3. The **LFU** heuristic will be very effective when the buffer needs to contain items that are used frequently.

<br>

### **Minimize the number of disk accesses!**

  - One way to minimize disk accesses is to compress the information stored on disk💽.
  - there is little or no difference in the time required to read several hundred contiguous bytes from disk as compared to reading one byte, so this strategy is indeed practical.
  - **File structure📂**: a data structure that organizes data stored in secondary memory.
  - the time to read information from disk is enormous compared to computation time, so almost any amount of additional computation to unpack the data is going to be less than the disk read time saved by reducing the storage requirements. 

<br>

### 8.2 Disk Drives💽

  - logical file: a random access file stored on disk as a contiguous series of bytes, with those bytes possibly combining to form data records. 
  - physical file: actually stored on disk is usually not a contiguous series of bytes. It could well be in pieces🥧 spread all over the disk. 
  - file manager: a part of the operating system, is responsible for taking requests for data from a logical file and mapping🗺️ those requests to the physical location of the data on disk. 

  -  direct access: Disk drives. it takes roughly equal time to access any record in the file.
  -  sequential access: tape drives;  which require the tape reader to process data from the beginning of the tape until the desired position has been reached.

<br>

### 8.2.1 Disk Drive Architecture

  - **seek**: the movement of the I/O head to position itself over the track containing the data. 
  - A hard disk drive is composed of one or more round platters, stacked one on top of another and attached to a central spindle.
  - **rotational delay or rotational latency**: the time spent waiting for the desired sector to come under the I/O head 
  - In fact, disk drives are designed not to read one byte of data, but rather to read an entire sector of data at each request. Thus, a sector is the minimum amount of data that can be read or written at one time.
  - **locality of reference**: _If one sector of the file is read, the next sector will probably soon be read_
  - **cluster**: A cluster is the smallest unit of allocation for a file, so all files are a multiple of the cluster size. The cluster size is determined by the operating system. The file manager keeps track of which clusters make up each file.
  - **extent**: A group of physically contiguous clusters from the same file
    - a file might consist of several extents widely spaced on the disk.
    - **file fragmentation🗃️**: the fuller the disk💽, and the more that files📂 on the disk change, the worse this file fragmentation🗃️ (and the resulting seek time) becomes
    - **internal fragmentation**: If a record crosses a sector boundary, two disk accesses might be required to read it. If the space is left empty instead, such wasted space.

<br>

### 8.2.2 Disk Access Cost

  - track-to-track cost, or the minimum time necessary to move from a track to an adjacent track
  - average seek time for a random access

### 8.3 Buffers and Buffer Pools

  - page📄: the information stored in a buffer
  - buffer pool: the collection of buffers
  - heuristic, or best guess👀❓
    - FIFO: the buffer to be replaced is the one that has held its information the longest, in hopes that this information is no longer needed.
      - However, many programs work with certain key pieces of information over and over again, and the importance of information has little to do with how long ago the information was first accessed. 
    -  “least frequently used” (LFU): 
      -  drawbacks: what was referenced many times in the past might now be irrelevant. Thus, some time mechanism where counts “expire” is often desirable.

  **virtual memory**
  - Virtual memory is a technique that allows the programmer to pretend that there is more of the faster main memory (such as RAM) than actually exists. 

<br>

## Quiz


<br>

## References
Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech. https://people.cs.vt.edu/shaffer/Book/JAVA3e20130328.pdf


<Br>
  
### Video

  - Andrew Crotty, CMU Database Group (2021) 05 - Buffer Pools (CMU Intro to Database Systems / Fall 2021) https://www.youtube.com/watch?v=Moz2AgC9hG4&ab_channel=CMUDatabaseGroup
  - David Black-Schaffer (2014) Virtual Memory: 3 What is Virtual Memory? https://www.youtube.com/watch?v=qlH4-oHnBb8&t=5s&ab_channel=DavidBlack-Schaffer
  - David Black-Shaffer (2014) Virtual Memory: 4 How Does Virtual Memory Work? https://www.youtube.com/watch?v=59rEMnKWoS4&ab_channel=DavidBlack-Schaffer
  - Max's Tech (2018) Primary VS Secondary Memory - Explained https://www.youtube.com/watch?v=LuDKfYv9VeI&ab_channel=Max%27sTech
  
