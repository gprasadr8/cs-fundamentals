# Two Pointer Technique
Two scenarios to use the two-pointer technique:

1. **Two pointers starts at different position:** one starts at the beginning while another starts at the end;
2. **Two pointers are moved at different speed:** one is faster while another one might be slower.

- singly linked list can only traverse in one direction, So the first scenario might not work.
- slow-pointer and fast-pointer technique is really useful.
- 
### Tips
There are several things you should pay attention:

- Always examine if the node is null before you call the next field.
- Getting the next node of a null node will cause the null-pointer error. 
- For example, before we run fast = fast.next.next, we need to examine both fast and fast.next is not null.
- Carefully define the end conditions of your loop.
- Run several examples to make sure your end conditions will not result in an endless loop. 



### Complexity Analysis
- If you only use pointers without any other extra space, the space complexity will be O(1).
- However, it is more difficult to analyze the time complexity. 
- In order to get the answer, we need to analyze how many times we will run our loop .
- In our previous finding cycle example, let's assume that we move the faster pointer 2 steps each time and move the slower pointer 1 step each time.
- If there is no cycle, the fast pointer takes N/2 times to reach the end of the linked list, where N is the length of the linked list.
- If there is a cycle, the fast pointer needs M times to catch up the slower pointer, where M is the length of the cycle in the list.
- Obviously, M <= N. So we will run the loop up to N times. And for each loop, we only need constant time.
- So, the time complexity of this algorithm is O(N) in total.
- If it is hard to analyze for all situations, consider the worst one.