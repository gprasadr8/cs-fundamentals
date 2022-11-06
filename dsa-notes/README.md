
### Data Structures:

Data Structure is a way to store and organize the data so that it can be used efficiently.<br>

#### what are we going to learn about Data Structures?

We are going to learn about it's <br>
1. Logical view
2. Operations
3. Cost of the Operations(in time)
4. Concrete Implementation 

#### Abstract Data Type(ADT): 
Before discussing about ADT will see System-defined data types for example all the primitive types(int, float, etc.) support basic operations like addition, subtraction. The system provides the implementation for primitive data types.<br> 
For user-defined data  types we also need to define operations, implementation for these operations will be done when we want to actually use them.<br>
The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented. It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. <br>
It is called “abstract” because it gives an implementation-independent view. The process of providing only the essentials and hiding the details is known as abstraction.<br>


**For example:**<br>
if we take Stack data structure as an example, it uses LIFO(Last-In-First-Out) mechanism to store the data and common **Operations** are: <br>
		1. **push():** insert the element to stack<br>
		2. **pop():** remove the element from stack<br>
		3. **peek():**  Return the element at the top of the stack without removing it, if the stack is not empty<br>
		4. **size():** find num of elements in stack<br>
ADT doesn't worry about the implementation of these operations.


		


		






