# Strings:

A string is actually an array of unicode characters. 
You can perform almost all the operations we used in an array.

However, there are some differences.
we will go through some of them which you should be aware of when dealing with a string.

### Compare Function:
String has its own compare function (we will show you the usage of compare function in the code below).

However, there is a problem:

Can we use "==" to compare two strings?

It depends on the answer to the question:

Does the language support operator overloading?

If the answer is yes (like C++), we may use "==" to compare two strings.
If the answer is no (like Java), we may not use "==" to compare two strings. When we use "==", it actually compares whether these two objects are the same object.

Immutable or Mutable
Immutable means that you can't change the content of the string once it's initialized.

In some languages (like C++), the string is mutable. That is to say, you can modify the string just like what you did in an array.
In some other languages (like Java), the string is immutable. This feature will bring several problems. We will illustrate the problems and solutions in the next article.
You can determine whether the string in your favorite language is immutable or mutable by testing the modification operation

Never forget to take the time complexity of built-in operations into consideration when you compute the time complexity for your solution.

### Immutable String - Problems & Solutions

You should know whether the string in your favorite language is immutable or not in the previous article. If the string is immutable, it will bring some problems. Hopefully, we will also provide the solution at the end.



Modification Operation
Obviously, an immutable string cannot be modified. If you want to modify just one of the characters, you have to create a new string.



Beware of String Concatenation in Java
You should be very careful with string concatenation. Let's look at an example when we do string concatenation repeatedly in a for loop:

```java
public class Main {
    public static void main(String[] args) {
        String s = "";
        int n = 10000;
        for (int i = 0; i < n; i++) {
            s += "hello";
        }
    }
}
```

Notice how slow string concatenation is for Java? On the other hand, there is no noticeable performance impact in C++.

In Java, since the string is immutable, concatenation works by first allocating enough space for the new string, copy the contents from the old string and append to the new string.

Therefore, the time complexity in total will be:

5 + 5 × 2 + 5 × 3 + … + 5 × n
= 5 × (1 + 2 + 3 + … + n)
= 5 × n × (n + 1) / 2,

which is O(n2).



Solutions
If you want your string to be mutable, there are some substitutions:



1. If you did want your string to be mutable, you can convert it to a char array.

```java
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] str = s.toCharArray();
        str[5] = ',';
        System.out.println(str);
    }
}
```

2. If you have to concatenate strings often, it will be better to use some other data structures like StringBuilder. The below code runs in O(n) complexity.
```java
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 10000;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append("hello");
        }
        String s = str.toString();
    }
}
```

