### Stack

A stack is an ordered list in which insertion and deletion are done at one end,called top.
It follows LIFO or FILO mechanism for storing and retrieving the elements.

Special names are given to the stack operations like push, pop, underflow and overflow.

#### Stack ADT:
For simplicity, assume the data is an integer type.
1. **Main Stack Operations:**    
    - **void push(int data):** inserts data into stack
    - **int pop():** Removes and returns the last inserted element from the stack
     
2. **Auxiliary Stack Operations:**
    - **int top():** Returns the last inserted element without removing it
    - **int size():** Returns number of elements stored in stack
    - **boolean isEmptyStack():** Indicates whether elements are stored in stack or not
    - **boolean isFullStack():** Indicates whether stack is full or not
    
#### Stack Exceptions:
1. **Underflow:** If we perform operation **pop or top** on empty stack then it will throw stack underflow exception.
2. **Overflow:** If we try to push an element in a full stack then stack overflow exception will be thrown    
  
#### Stack usages real time applications:

1. Balancing of symbols
2. Infix-to-postfix conversion
3. Evaluation of postfix conversion
4. Implementing function calls (including recursion)
5 Page-visited history in a web browser
6. Undo sequence in a text editor
7. Matching tags in HTML and XML
8. Auxiliary data structure for other algorithms(Ex: Tree traversal algorithms)
9. Component of other data structures (Ex: Simulating queues)

### Stack Implementations:
There are many ways of implementing Stack ADT. Below are commonly used methods.
1. Simple array based implementation
2. Dynamic array based implementation
3. Linked lists implementation


#### 1. Simple array based implementation:
This implementation of stack ADT uses an array, we add elements like normal array insertions and we use a variable to keep track of the index of the top element.




