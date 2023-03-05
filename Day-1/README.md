## Day 1: Introduction to Java programming

**Step 1:** Install Java Development Kit (JDK)

- Visit the Oracle website to download the latest version of the JDK: https://www.oracle.com/java/technologies/downloads/
- Follow the installation instructions for your operating system

**Step 2:** Set up a development environment

- You can use any text editor or Integrated Development Environment (IDE) for Java development. Some popular choices include Eclipse, IntelliJ IDEA, and NetBeans.
- Download and install your preferred text editor or IDE.

**Step 3:** Write your first Java program

- Open your text editor or IDE and create a new file called "HelloWorld.java"
- In the file, write the following code:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
This program simply prints the message "Hello, World!" to the console.

**Step 4:** Compile and run the program

- Open a command prompt or terminal window and navigate to the directory where your "HelloWorld.java" file is located.
- Compile the program by typing the following command:
```
javac HelloWorld.java
```
- If there are no errors, this will generate a new file called "HelloWorld.class" in the same directory.
- Run the program by typing the following command:
```
java HelloWorld
```
- The program should run and output the message "Hello, World!" to the console.
Congratulations, you have written and executed your first Java program!

Now, let's dive deeper into the basic concepts of Java programming.

### Variables and data types

- In Java, you need to declare a variable before you can use it. A variable is a container for storing data.
- There are several data types in Java, including int, double, boolean, and String. Each data type has its own rules for storing and manipulating data.
- To declare a variable, you specify the data type followed by the variable name, like this:
```java
int age;
double salary;
boolean isEmployed;
String name;
```
You can also initialize the variable with a value when you declare it, like this:
```java
int age = 25;
double salary = 50000.0;
boolean isEmployed = true;
String name = "John";
```
### Control structures

- Control structures allow you to control the flow of your program based on certain conditions.
- The if statement is one of the most basic control structures in Java. It allows you to execute a block of code only if a certain condition is true, like this:
```java
if (age >= 18) {
    System.out.println("You are an adult.");
}
```
- The for loop is another common control structure in Java. It allows you to execute a block of code repeatedly for a certain number of times, like this:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
- The while loop is similar to the for loop, but it allows you to execute a block of code repeatedly as long as a certain condition is true, like this:
```java
while (isEmployed) {
    System.out.println("You are employed.");
}
```
### Putting it all together

- Now that you know the basics of Java programming, you can try combining them to create more complex programs.
- Here's an example program that takes user input and calculates the area of a rectangle:
```java
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
```
Congratulations, you have completed Day 1 of the program! Tomorrow, we will dive deeper into Java programming by learning about arrays and loops.
