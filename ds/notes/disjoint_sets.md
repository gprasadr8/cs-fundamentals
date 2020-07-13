### disjoint sets:

In mathematics, two sets are said to be disjoint sets if they have no element in common. <br>
Which means intersection of two sets will be empty set.<br>

**For example:** <br>
    
   s1 = {1, 2, 3} <br>
   s2 = {4, 5, 6} <br> 
   s1 &cap; s2 = &empty;<br>
   s1 and s2 sets are disjoint sets <br>
    
   s3 = {1, 2, 3}<br> 
   s4 = {3, 4, 5} <br>
   s3 &cap; s4 &ne; &empty; <br>
   s3 and s4 sets are not disjoint sets <br>
   
### Disjoint sets in data structures:
a disjoint-set data structure is a structure(also called a **union–find data structure or merge–find set**), that maintains a collection S1, S2, S3, …, Sn of dynamic disjoint sets. <br>
Two sets are disjoint if their intersection is null. <br>
In a data structure of disjoint sets every set contains a representative, which is one member of the set. <br>

**Let’s consider the following problem:** 
In a room are **N** persons, and we will define two persons are friends if they are directly or indirectly friends. <br>
If A is a friend with B, and B is a friend with C, then A is a friend of C too. <br>
A group of friends is a group of persons where any two persons in the group are friends.

**Question:** <br>
Given the list of persons that are directly friends find the number of groups of friends and the number of persons in each group. <br>

**Input:** <br>
Num of people in a room N = 5 and the list of friends is: 1-2, 5-4, and 5-1.

**Solution:** <br>
Let’s see how things will work with sets for the example of the problem. <br>
The groups will be represented by sets, and the representative of each group is the person with the biggest index.<br>
At the beginning there are 5 groups (sets): {1}, {2}, {3}, {4}, {5}. <br>
Nobody is anybody’s friend and everyone is the representative of his or her own group. <br>
**Step-1:**<br>
From first input 1 and 2 will become friends, which means {1} and {2} sets will become one group {1,2} and the representative of the first group will become 2. <br>
Now all the sets are {1,2}, {3}, {4}, {5} <br>

**Step-2:**<br>
Second input 5 and 4 will become friends, which means {5}, {4} sets will become second group {5,4} and the representative of the first group will become 5. <br>
Now all sets {1,2}, {3}, {4,5} <br>

**Step-3:** <br>
Third input 5 and 1 will become friends, which means {1,2}, {4,5} sets will become as one group {1,2,4,5} and the representative of the first group will become 5 <br>
Now all sets {1,2,4,5}, {3} <br>

After applying input final groups(sets): {1,2,4,5} and {3} <br>
group-1: {1,2,4,5} and representative: 5(highest index/rank) <br>
group-2: {3} and representative: 3 <br>

**question:** find the number of groups of friends and the number of persons in each group? <br>
Num of groups: 2 <br>
Num of persons in group-1: {1,2,4,5} = 4 <br>
Num of persons in group-2: {3} = 1 <br>

#### Other questions:

1. how to find if two persons are friends(which means under same group)?
This is where the use of the representative elements comes in. <br>
To check if two elements are in same group will use representative elements.<br>
**For example:**<br> Find 2 and 3 are friends(same group)? <br>
If representative of 3 and 2 are same then both are friends(means both are in the same group) <br>
person-2 representative is 5 and person-3 representative 3; therefore 3 and 2 aren’t in same groups of friends. <br>
 









 