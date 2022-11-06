
## Algorithm
An algorithm is a step-by-step procedure or unambiguous instructions to solve a given problem

### Analysis of Algorithm
- To solve a single problem there will be n number of solutions will be available.
- The goal of algorithm analysis is to compare efficiency of the algorithms without implementing them on any machine.
- Analysis is mainly in terms of running time but also in terms of other factors like
space, network consumption, CPU registers etc


### What is running time analysis?
It is the process of determining how processing time increases as the size of the problem (input size) increases.
Input size is the number of elements in the input, and depending on the problem type, the input may be of different types.
The following are the common types of inputs.
- Size of an array
- Polynomial degree
- Number of elements in a matrix
- Number of bits in the binary representation of the input
- Vertices and edges in a graph.

### Runtime Analysis:
To check with the time efficiency of an algorithm we use runtime analysis, 
which is nothing but finding how much time it took to execute the algorithm.
- execution time we get as a time function
- To calculate the runtime of an algorithm , first we need to set some basic assumptions for execution time, which should be independent of machine and programming language.
- The assumptions are:
  - Every simple operation (+,-,*,=,if) takes exactly one time step
  - Loops and subroutines are not considered as simple operations. The time it takes to run through a loop or execute a sub program depends upon the number of loop iterations or the specific nature of the subprogram.
  - Each memory access takes exactly one time step. We won't consider whether an item is in cache or on the disk.
- We measure the runtime by counting up the number of steps an algorithm takes on a given problem instance.
- the result of this runtime analysis is a numerical function or time function.
- for example:
```java
void swap(int a,int b) { // total execution time = 3 time steps
    int temp = a; // execution time = 1 time step
    a=b; // execution time = 1 time step
    b=temp; // execution time = 1 time step
    //runtime analysis f(n) = 3 = constant time    
}
```
### Frequency count method for Time complexity



### Best Case, Worst Case and Average Case Complexities:

There are 3 types of runtime analysis:
- **Worst Case Complexity:** Defines the input for which the algorithm takes a long time (the slowest time to complete)
- **Best Case Complexity:** Defines the input for which the algorithm take  the least time (the fastest time to complete)
- **Average Case Complexity:** 
  - provides the prediction about the running time of the algorithm
  - Run the algorithm many times, using many inputs, compute the total running time and devided by the number of trails.
  - for example: run algo with 10 diff inputs and find avg time for 10 inputs = (Total running time of 10 inputs)/10;
  - Assumes that input is random
- For example :
  - let f(n) be the function, which represents the given algorithm
  - f(n)= n^2 + 1240n + 500, for worst case
  - f(n)= n + 100n + 500 for best case

  
- Each of this time complexities are represented as complicated time functions. To simplify this complex functions we use Asymptotic notations


### Asymptotic Notation:
- To simplify complex time functions we use Asymptotic notations. 
- Asymptotic Notations are used to identify the upper and lower bounds of the function.

#### 1. Big-O Notation:
This notation gives the tight upper bound of the given function.
```
f(n) = O(g(n))

For example:
if f(n) = n^4 + 100n^2 + 10n + 50 is the given algorithm, then n^4 is the g(n).
That means g(n) gives the maximum rate of growth for f(n) at larger values of n.
```

Big-O notation defined as  
```
O(g(n)) = { f(n): there exist positive constants c and n0 such that
                0<= f(n) <= cg(n) for all n>=n0
            }
g(n) is tight upper bound for f(n)           
````
 

- Big-O simplifies the analysis by ignoring low levels of details which does not impact on comparision of algorithms
- Big-O ignores multiplicative constants
  - f(n) = 2n and g(n) = n 
  - both are identical in Big-O notation: f(n) = g(n)

### Examples for Asymptotic Analysis
There are some general examples to help us determine the running time of an algorithm

#### 1. Simple Operations(+,-,*,=,if):
Running time of simple operations or any statements will take exactly on time step.
```java
int sum(int a, int b){ // total running time = 2 time steps
    int sum = a+b; // execution time = 1 time step
    return sum; // execution time = 1 time step
        }
 // f(n) = 2 = constant time = O(1)       
```

#### 2. Loops:
Running time of a loop is at most the running time of the statements inside the loop multiplied by the number of iterations
**Example-1:**
````java
// executes n times
for(int i=1;i<n;i++)
    m=m+2; // constant time c

// Total time = a constant c *  n times = cn = O(n)
//Consider how many times the stmt is executed not the size of n
````
**Example-2:**

```java
for(i=1;i<n;i+2)
    m=m+2; //constant time =c

// n=10 i=1  stmt-1
//i=3  stm-1
//i=5 stmt-1
//i=7 stmt-1
//i=9 stmt-1
//i=11 
//Total 5 times stmt is executed
// n=10 but stmt is executed 5
// f(n) = n/2 = O(n)
```
```java
p=0
for(i=1;p<=n;i++){
    p=p+i; //
}
/*
        i       p 
        1      0+1=1
        2      1+2=3
        3      (1+2)+3=6
        4      (1+2+3)+4 = 10
        -       -
        -       -
        k       1+2+3+4+---+(k-1)+k = k(k+1)/2
        
  
  p<=n condition will fail when p>n
  Assume that p>n at k
  statements executed upto k times
  p = k(k+1)/2
  k(k+1)/2 >n
  k^2 > n
  k > sqrt(n)
  O(n)=sqrt(n)      
 Source: https://youtu.be/9TlHvipP5yA
        
 */
```


#### 3. Nested Loops:
Analyze from inside out. Total running time is the product of the sizes of all the loops.
**Example-1:**

```java
//outer loop executes n times
for(int i=1;i<n;i++){
    //inner loop executes n times
    for(int j=1;j<n;j++){
        k=k+1; // constant time= c
    }
}
//Total Running Time = c * n * n = cn^2 = O(n^2)
```
**Example-2:**

```java
for(i=0;i<n;i++){
    for(j=0;j<i;j++){
        stmt; // constant time
        }
}
/*
        i     j   no of times
                  stmt executed
        0          
        1    0              1
        2    0,1            2
        3    0,1,2          3
        4    0,1,2,3        4
        -       -           -
        -       -           -
        n    0,1,2,..n-1    n
        
    statement is executed 0+1+2+3+4+5+-----+n
    sum(n) = n(n+1)/2 = n^2/2+n/2 = O(n^2)
        
        
 */
```
#### 4. Consecutive Statements:
Add the time complexities for each statement
```java
x = x+1; //constant time = c0

//executes n times
for(int i=1;i<n;i++){
    m = m+2; // constant time = c1 
}

//outer loop executes n times
for(int i=1;i<n;i++){
    //inner loop executes n times
    for(int j=1;j<n;j++){
        k=k+1; // constant time= c2
    }
}

// Total Running Time = c0 + c1*n + c2*n*n = c0+c1n+c2n^2 = O(n^2)
```

#### 5. If else statements
Worst case running time: the test, plus either that if part or the else part whichever is larger.
```java
//test: constant time=c0
if(length()==0){
    return false; // constant time=c1
}else{
    //else part test: c2 (constant+constant) * n times
    for(i=0;i<n;i++){
        //another if test:constant no else part c3
        if(!list[i].equals(otherList[i]))
            return false; // constant
    }
}
// Total Running Time = c0+c1+(c2+c3)*n = O(n)
```

#### 6. Logarithmic Complexity
An algorithm is O(logn) if it takes a constant time to cut the problem size by a fraction usually by 1/2.
```java
for(i=1;i<n;){    
    i=i*2;
}
OR
for(i=n;i>1;)
    i=i/2;
```

#### Time Complexity Examples Sources:
1. https://youtu.be/9TlHvipP5yA
2. https://youtu.be/9SgLBjXqwd4
3. 
### Commonly used logarithms and Summations
####Logarithms:

### Sources:
1. https://youtu.be/KXAbAa1mieU
2. https://youtu.be/luXiytGnYpY
3. https://youtu.be/9TlHvipP5yA
4. https://youtu.be/9SgLBjXqwd4?list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O
5. 

Current:
1. https://youtu.be/f_IaKCB7Zo8?list=PLBlnK6fEyqRj9lld8sWIUNwlKfdUoPd1Y