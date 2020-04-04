### Priority Queues:
Priority Queue is an extension of queue with following properties. <br>

1. Every item has a priority associated with it. <br>
2. An element with high priority is served/dequeued before an element with low priority. <br>
3. If two elements have the same priority, they are served according to their order in the queue. <br>

#### Priority Queue Operations:
**insert(item, priority):** Inserts an item with given priority. <br>

**getHighestPriority():** Returns the highest priority item. <br>

**deleteHighestPriority():** Removes the highest priority item. <br>

**Additional Operations:**<br>

**kth-largest:** returns the k-th largest element from queue <br>
**heapSort():** sorts the elements in Priority Queue based on priority. <br>

#### Priority Queue implementations:

There are several options available to implement priority queue ADT.

##### Unordered Array Implementation:
- Elements are inserted into the array without bothering about the order. <br> 
- Deletions(removeHighestPriority/deleteMax) are performed by searching the key and then deleting it. <br>
**Insertions Complexity: O(1), Delete Max Complexity: O(n)**  
 
##### Unordered List Implementation:
It is similar to Unordered Array Implementation, but instead  of arrays, linked lists are used. <br>
**Insertions Complexity: O(1), Delete Max Complexity: O(n)**

##### Ordered Array Implementation:
Elements are inserted into the array in sorted order based on the priority. Deletions are performed at only one end.<br>
 
**Insertions Complexity: O(n), Delete Max Complexity: O(1)**

##### Ordered List Implementation:
It is similar to Ordered Array Implementation, but instead  of arrays, linked lists are used. <br>

**Insertions Complexity: O(n), Delete Max Complexity: O(1)**

##### Binary Heap Implementation:


**Conclusion:**<br>
we can implement priority queues by using arrays and linked list also but Heap is generally preferred for priority queue implementation because heaps provide better performance compared arrays or linked list. <br>
 
In a Binary Heap, getHighestPriority() can be implemented in O(1) time, insert() can be implemented in O(Logn) time and deleteHighestPriority() can also be implemented in O(Logn) time. <br>

With Fibonacci heap, insert() and getHighestPriority() can be implemented in O(1) amortized time and deleteHighestPriority() can be implemented in O(Logn) amortized time.<br>
                                                                          
#### Applications of Priority Queue:
- Data compression: Huffman Coding algorithm <br>
- Selection Problem: finding Kth-smallest/largest problems. <br>
- CPU Scheduling <br>
- Graph algorithms like Dijkstra’s shortest path algorithm, Prim’s Minimum Spanning Tree, etc <br>
- All queue applications where priority is involved.<br>




### Binary Heap:

A Binary Heap is a Binary Tree with following properties. <br>

1) It’s a complete tree (All levels are completely filled except possibly the last level and the last level has all keys as left as possible). This property of Binary Heap makes them suitable to be stored in an array.

2) A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key at root must be minimum among all keys present in Binary Heap. The same property must be recursively true for all nodes in Binary Tree. Max Binary Heap is similar to MinHeap.

How is Binary Heap represented?
A Binary Heap is a Complete Binary Tree. A binary heap is typically represented as an array.

The root element will be at Arr[0].
Below table shows indexes of other nodes for the ith node, i.e., Arr[i]:

`Arr[(i-1)/2]	Returns the parent node`
`Arr[(2*i)+1]	Returns the left child node`
`Arr[(2*i)+2]	Returns the right child node`
The traversal method use to achieve Array representation is Level Order
Binary Heap satisfies the Ordering Property.
The Ordering can be of two types:
1. Min Heap Property: The value of each node is greater than or equal to the value of its parent, with the minimum value at the root.

2. Max Heap Property: The value of each node is less than or
equal to the value of its parent, with the maximum value at the root.


Applications of Heaps:
1) Heap Sort: Heap Sort uses Binary Heap to sort an array in O(nLogn) time.

2) Priority Queue: Priority queues can be efficiently implemented using Binary Heap because it supports insert(), delete() and extractmax(), decreaseKey() operations in O(logn) time. Binomoial Heap and Fibonacci Heap are variations of Binary Heap. These variations perform union also efficiently.

3) Graph Algorithms: The priority queues are especially used in Graph Algorithms like Dijkstra’s Shortest Path and Prim’s Minimum Spanning Tree.

4) Many problems can be efficiently solved using Heaps. See following for example.
a) K’th Largest Element in an array.
b) Sort an almost sorted array/
c) Merge K Sorted Arrays.

Operations on Min Heap:
1) getMini(): It returns the root element of Min Heap. Time Complexity of this operation is O(1).

2) extractMin(): Removes the minimum element from MinHeap. Time Complexity of this Operation is O(Logn) as this operation needs to maintain the heap property (by calling heapify()) after removing root.

3) decreaseKey(): Decreases value of key. The time complexity of this operation is O(Logn). If the decreases key value of a node is greater than the parent of the node, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.



4) insert(): Inserting a new key takes O(Logn) time. We add a new key at the end of the tree. IF new key is greater than its parent, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.

5) delete(): Deleting a key also takes O(Logn) time. We replace the key to be deleted with minum infinite by calling decreaseKey(). After decreaseKey(), the minus infinite value must reach root, so we call extractMin() to remove the key.



                                                                      