# Two-pointer Technique - Scenario I

- we solve some problems by iterating the array. 
- Typically, we only use one pointer starting from the first element and ending at the last one to do iteration. 
- However, sometimes, we might need to use two pointers at the same time to do the iteration.

- For Example, Reverse the elements in an array.
- The idea is to swap the first element with the end, advance to the next element and swapping repeatedly until it reaches the middle position.
- We can use two pointers at the same time to do the iteration: one starts from the first element and another starts from the last element.
- Continue swapping the elements until the two pointers meet each other.

Here is the code for your reference:

```java
public static void reverse(int[] v, int N) {
    int i = 0;
    int j = N - 1;
    while (i < j) {
        swap(v, i, j);  // this is a self-defined function
        i++;
        j--;
    }
}

```

Summary

- one of the typical scenarios to use two-pointer technique is that you want to Iterate the array from two ends to the middle.

So you can use the two-pointer technique:

One pointer starts from the beginning while the other pointer starts from the end.

And it is worth noting that this technique is often used in a sorted array.


## Two-pointer Technique - Scenario II
Sometimes, we can use two pointers with different steps to solve problems.



An Example
Let's start with another classic problem:

Given an array and a value, remove all instances of that value in-place and return the new length.

If we don't have the limitation of space complexity, it will be easier. We can initialize a new array to store the answer. 
Iterate the original array and add the element to the new array if the element is not equal to the given target value.

Actually, it is equivalent to using two pointers, one is used for the iteration of the original array and another one always points at the last position of the new array.



Reconsider the Space Limitation
Now let's reconsider the space limitation.

We can use a similar strategy. 
We still use two pointers: one is still used for the iteration while the second one always points at the position for next addition.

Here is the code for your reference:

```java
public int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; ++i) {
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}
```

We use two pointers, one faster-runner i and one slower-runner k, in the example above. 
i moves one step each time while k moves one step only if a new needed value is added.



Summary
This is a very common scenario of using the two-pointer technique when you need:

One slow-runner and one fast-runner at the same time.

The key to solving this kind of problems is to

Determine the movement strategy for both pointers.

Similar to the previous scenario, you might sometimes need to sort the array before using the two-pointer technique. 
And you might need a greedy thought to determine your movement strategy.



