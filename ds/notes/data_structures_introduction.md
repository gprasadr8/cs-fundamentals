##Data Structures Introduction


### Data Types: 
Data type specifies which type of value can be stored in a variable and what are the operations can be performed on those values.

Two important things about data types:
1. Defines a certain type of values
2. Defines Operations allowed on those values

**For Example:**

**int type:**
- takes only integer values
- **Operations:** addition, subtraction, multiplication, bitwise operations etc.

**float type:**
- takes only floating point values
- **Operations:** addition, subtraction, multiplication, division etc. But bitwise and mod(%) operations are not allowed.

### User Defined Data Types
- Some data types are specified in the language itself those are called primitive data types/built-in (ex: int,long, float, boolean,..etc)
- if user defines the data type and allowed operations those are called as user defined data types

**Example:** classes, interface, etc
```java
class Calculator {
    int input_1;
    int input_2;
    public int addition(){
        return input_1 + input_2;
    }
    public int multiplication(){
        return input_1 * input_2;
    }
}
```

### Abstract Data Types (ADT):

ADTs are user defined data types which defines the operations on the values using functions without specifying how they can be implemented.


**For Example:** 

**Stack ADT:** A stack consists of elements of same type arranged in a sequential order

**Operations:**
```
initialize() - initializing empty stack
push() - insert an element into stack
top() - returns top element of the stack
pop() - delete an element from stack
isEmpty() - checks if stack is empty
isFull() - checks if stack is full
```

- Abstract Data Types hides the implementation from the user
- There are multiple ways to implement an ADT
**For Example:** Stack ADT can be implemented by using either arrays or Linked Lists
- ADTs provides abstraction means ADTs are skeltons i.e interface. If user wants to use an ADT they can use it's operations without knowing about it's implementation
- **For Exmaple:** if user wants to use Stack, they can simply use push and pop operations without knowing it's implementation

- ADTs are generic concepts irrespective of programming language 



### Data Structures:
Data structure is a particular way of storing and organizing the data in a computer so that it can be used efficiently.Efficiently means in terms of time as well as space

- in other words, data structure is used to implement an ADT
- **For example:** in order to implement **Stack ADT**, we can use an **array** or **linked list** data structures.
- ADT tells us **what** is to be done and data structure tells us **how** to do it
- ADT gives blueprint and data structures gives the implementation

#### How to know  which data structure to use for a particular ADT?
Generally, different implementations of ADT are compared for time and space efficiency.
Based on the user requirement best suited will be selected.

**For Example:**
**Stack ADT:** can be implemented by using array and linked lists. based on user requirement like if user wants time efficiency then he will select the proper best data structure in both of them.


#### Advantages of Data Structures
- **Efficiency:** proper choice of data structures make program efficient in terms of space and time.
- **Reusability:** one implementation can be used by multiple client programs
- **Abstraction:** Data structure is specified by an ADT which provides a level of abstraction. the client program doesn't have to worry about the implementation details.


### Types of Data Structures:

#### 1. Linear Data Structures:
A data structure is a linear when all the elements are accessed in a linear(sequentially) order.
but it's not compulsory to store all elements sequentially(ex linked list).

**Examples:** Array, Stack, Queue, Linked List

#### 2. Non-Linear Data Structures
A data structure is a non-linear when all the elements are not stored/accessed in a linear(sequential) order.
**Examples:** Trees and Graphs








 
