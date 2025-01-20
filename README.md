# Java Lambdas and Streams Exercises

This repository contains exercises designed to practice Java Lambdas and Streams (Java 8+). The exercises focus on leveraging functional programming paradigms to simplify and enhance Java code. Below are the details of each exercise, grouped by level.

---

## **Level 1**

### **Exercise 1**
- Write a method that returns a list of all strings containing the letter 'o' from a list of strings. Print the result.

### **Exercise 2**
- Modify the method from Exercise 1 to return a list of strings that contain the letter 'o' and have more than 5 characters. Print the result.

### **Exercise 3**
- Create a list with the names of the months of the year. Print all elements of the list using a lambda expression.

### **Exercise 4**
- Perform the same printing operation as in Exercise 3, but use a method reference instead.

### **Exercise 5**
- Create a functional interface with a method `getPiValue()` that returns a `double`. From the `main()` method, assign the value 3.1415 to this method using a lambda and invoke it to print the result.

### **Exercise 6**
- Create a list containing numbers and strings. Sort the list by string length, from shortest to longest.

### **Exercise 7**
- Using the list from Exercise 6, sort it in reverse order by string length, from longest to shortest.

### **Exercise 8**
- Create a functional interface with a method `reverse()` that receives and returns a `String`. Use a lambda to implement this method so it reverses the input string. Test the method by passing a string and verifying the result.

---

## **Level 2**

### **Exercise 1**
- Create a list of strings with proper names. Write a method that returns a list of all strings starting with the letter 'A' (uppercase) and having exactly 3 characters. Print the result.

### **Exercise 2**
- Write a method that returns a comma-separated string based on a list of integers. Each element should be preceded by 'e' if it is even or 'o' if it is odd.
  - Example: Given the list `(3, 55, 44)`, the output should be: `"o3, o55, e44"`. Print the result.

### **Exercise 3**
- Create a functional interface with a method `operacio()` that returns a `float`. Use a lambda to inject the implementation for addition, subtraction, multiplication, and division.

### **Exercise 4**
- Create a list containing some strings and numbers. Perform the following:
  - Sort alphabetically by the first character.
  - Sort strings containing 'e' first, followed by the rest.
  - Replace all occurrences of 'a' in strings with '4'.
  - Display only numeric elements (even if stored as strings).

---

This repository explores the power of Java Lambdas and Streams, enabling you to write clean and concise code. It covers functional interfaces, lambda expressions, method references, and stream operations.
