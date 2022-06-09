## Data Structures Introduction

### Data Types: 

Data type define
- certain type of value
- Operations allowed on those values
- For ex: int, float
  - int takes only integer values. 
    - **Operations performed:** addition, subtraction, multiplication, bitwise operations.
  - float takes only floating point values. 
    - **Operations performed:** addition, subtraction, multiplication, division etc. But bitwise and mod(%) operations are not allowed.
  
### User Defined Data Types
- Programming language defines primitive data types like int, float, boolean etc.
- User can define data types of his/her own and operations performed on them.
- **Example:** classes, interface, etc

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
- ADTs are user defined data types along with the operations on the values using functions without implementation details.
- **For Example: Stack ADT:** A stack consists of elements of same type arranged in a sequential order
- **Operations:**
```
initialize() - initializing empty stack
push() - insert an element into stack
top() - returns top element of the stack
pop() - delete an element from stack
isEmpty() - checks if stack is empty
isFull() - checks if stack is full
```
- ADT hides the implementation from the user.
- There are many ways to implement an ADT.
- **For Example:** Stack ADT can be implemented by using either arrays or Linked Lists.
- ADTs provides abstraction means ADTs are just skeltons i.e interface. User can use an ADT without knowing implementation details.
- **For Exmaple:** If Stack functionality is needed, use operations like push and pop without knowing how it is implemented.
- ADTs are generic concepts not specific to any programming language.

### Data Structures:
- Data structure is a particular way of storing and organizing the data in a computer so that it can be used efficiently.
- Efficiently means in terms of both time and space.
- Data structures are implementation of an ADT.
- **For example:** To implement **Stack ADT**, an **array** or **linked list** data structures can be used.
- ADT defines **what** operations can be done and data structure defines **how** they are implemented.
- ADT gives blueprint and data structures gives the implementation

#### How to know  which data structure to use for a particular ADT?
- Different implementations of ADT are compared for time and space efficiency. Based on the user requirement best suited will be selected.
- **For Example: Stack ADT:** can be implemented by using array or linked list. Based on efficiency of various operations like push, pop etc.. either one can be choosen as per the requirement. 

#### Advantages of Data Structures
- **Efficiency:** proper choice of data structures make program efficient in terms of space and time.
- **Reusability:** one implementation can be used by multiple client programs.
- **Abstraction:** Data structure is specified by an ADT which provides a level of abstraction. Client program doesn't need to know the implementation details.

Types of Data Structures:
--
- Linear Data Structures:
  - A data structure is linear when all the elements are accessed in sequential order.
  - It is not mandatory to store all elements sequentially(Ex: linked list).
  - Examples of linear data structures are Array, Stack, Queue, Linked List etc.
- Non-Linear Data Structures
  - A data structure is non-linear when all the elements are not accessed in sequential order.
  - Examples of non-linear data strcutres include Trees and Graphs etc.








 
