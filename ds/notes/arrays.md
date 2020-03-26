### Arrays:
Arrays are used to store collection of elements which are same type and elements will be stored in continuous memory location.

- we can access elements with constant time.

#### Disadvantages of Arrays:

- fixed size. The size of the array should be specified before using it

- Memory will be allocated based on array size and memory will be wasted if elements are empty

- continuous memory allocation: Sometimes it will be difficult to accomodate continuous memory block for larger arrays.

- complex position based insertions: To insert the element in the middle then we have shift to existing elements.

**For Example:**<br>

`int[] ary = new int[100];`

100 continuous memory locations will be allocated to array. If we store only 10 values then remaining 90 locations will be wasted.


### Dynamic Arrays:

Dynamic Arrays will solve the fixed size issue in Arrays. It also called as **growable array, resizable array, dynamic table, or array list**

#### how to implement Dynamic Arrays?
Simple way of implementing dynamic arrays is to initially start with some fixed size array.As soon as array becomes full, create the new array with double size of the original array.

