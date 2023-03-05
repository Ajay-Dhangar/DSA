# Day 2: Arrays and ArrayLists.

## Creating Arrays in Java
- An array is a data structure that allows you to store multiple values of the same data type in a single variable.
- In Java, you declare an array by specifying the data type followed by square brackets, like this:

```java
int[] numbers;
```
- To initialize an array, you can use the new keyword and specify the size of the array, like this:
```java
int[] numbers = new int[5];
```
- You can also initialize an array with values when you declare it, like this:
```java
int[] numbers = {1, 2, 3, 4, 5};
```
## Accessing Array Elements

- You can access the elements of an array using the index number. The index number starts from 0 for the first element, and increases by 1 for each subsequent element.
- To access an element of an array, you use the square brackets and specify the index number, like this:
```java
int[] numbers = {1, 2, 3, 4, 5};
int thirdNumber = numbers[2];
```
## Updating Array Elements
- You can update the value of an element in an array by assigning a new value to it using the index number, like this:
```java
int[] numbers = {1, 2, 3, 4, 5};
numbers[2] = 10;
```
## Deleting Array Elements

- In Java, you cannot delete an element from an array directly. Instead, you have to create a new array with the desired elements.
- Here's an example that removes the third element from an array:
```java
int[] numbers = {1, 2, 3, 4, 5};
int[] newNumbers = new int[numbers.length - 1];
for (int i = 0; i < newNumbers.length; i++) {
    if (i < 2) {
        newNumbers[i] = numbers[i];
    } else {
        newNumbers[i] = numbers[i + 1];
    }
}
numbers = newNumbers;
```
## Creating ArrayLists in Java

- An ArrayList is a dynamic array that can grow or shrink as needed. It is part of the java.util package.
- To create an ArrayList, you declare it like this:
```java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<Integer>();
```
- Here, we've declared an ArrayList that can hold integers.

## Inserting Elements into ArrayLists

- To insert an element into an ArrayList, you can use the add() method, like this:
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
```
- This will add the numbers 1, 2, and 3 to the ArrayList.

## Updating Elements in ArrayLists

- To update an element in an ArrayList, you can use the set() method, like this:
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.set(1, 10);
```
- This will change the second element of the ArrayList from 2 to 10.

## Removing Elements from ArrayLists

- To remove an element from an ArrayList, you can use the remove() method, like this:
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.remove(1);
```
- This will remove the second element of the ArrayList, which is the number 2.

## Retrieving Elements from ArrayLists

- To retrieve an element from an ArrayList, you can use the get() method, like this:
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
int secondNumber = numbers.get(1);
```
- This will retrieve the second element of the ArrayList, which is the number 2.

## Iterating through ArrayLists

- You can use a for loop to iterate through an ArrayList and access its elements, like this:
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
for (int i = 0; i < numbers.size(); i++) {
    System.out.println(numbers.get(i));
}
```
- This will print out all the elements of the ArrayList.
- That's it for Day 2: Arrays and ArrayLists! By now, you should have a good understanding of how to create and manipulate arrays and ArrayLists in Java.
