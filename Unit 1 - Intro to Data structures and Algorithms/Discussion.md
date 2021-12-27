    "A type is a collection of values. For example, the Boolean type consists of the values `true` and `false`. 
    The integers also form a type. An integer is a simple type because its values contain no subparts. 
    A bank account record will typically contain several pieces of information 
    such as name, address, account number, and account balance. 
    Such a record is an example of an aggregate type or composite type. 
    A data item is a piece of information or a record whose value is drawn from a type. 
    A data item is said to be a member of a type."


- Type: according to Shaffer (2011), type is a collection of values. For instance, a collection of single-digit natural numbers is a type with 10 values from 0 to 9. This example is a simple type as all values are of the same data type. They are all integers. In contrast, aggregate type or composite type are a collection of values of multiple data types. Our course 'Data Structure' could be an example of this. Its name ("Data Structure") and code ("CS 3303") are of String type and its credit (3) integer. 
- Data Item: data item is a piece of information from type (Shaffer, 2011). 
- Data type: data types are literally types for data that group data according to certain criteria. Although primitive data types might vary slightly depending on the language, they tend to largely represent the same concepts. In java, there are 9 primitive* data types (Oracle, n.a.): 
  - byte, short, int, long, float, double: these are datatypes of numbers. The first 4 (byte, short, in, long) are integers of varying ranges. The latter two are floats of different ranges. 
  - boolean: boolean data type represents the binary. 0 and 1, or true and false. Unlike the rest of the datatypes that have a large pool of data items that can be categorised into these types, boolean type has only two values for its binarity. 
  - String, char: these are data type of letters. Each data piece of char type is a single letter. String type is a set of multiple characters. Words and phrases are String type data. 

- Abstract Data Type (ADT): apart from the primitive data types, it is also possible for the human programmer to design and define custom data types. If we want to make a course catalogue, for instance, we would have to create a data type called 'Course', that contains String variables like CourseName and CourseCode, and integer values like number of credits. 
- Data Structure: data structure is the implementation of ADT (Shaffer, 2012). 
- Class: class is a set of specified variables and defined method. It is a description / definition of an object that can perform specific functionalities (as defined by the method).
- Member Function: function is a defined set of actions performed by a class. 'Member' function means the function belongs to a certain class. 
- Data Members: similarly, data member is a piece of data that belongs to a certain data item. 

* in computer science context, primitive means the most basic, so it cannot be further divided or grouped into sub-categories. Perhaps we can also say 'atomic', it cannot be broken down any further

<br>

### References
Shaffer, C. (2011). A Practical Introduction to Data Structures and Algorithm Analysis. Blacksburg: Virginia. Tech.
Oracle (n.a.) Datatypes https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
