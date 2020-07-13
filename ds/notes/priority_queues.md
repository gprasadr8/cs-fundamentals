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







                                                                      