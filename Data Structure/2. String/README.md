
In Java, a string is a sequence of characters that is used to represent text. A string can be created in Java using the String class. Here's an A2Z guide on Strings in Java for beginners to advance:

## Creating a string:
Strings can be created in Java in several ways. Here are some of the most common ways:

```java
String s1 = "Hello";  // Using string literal
String s2 = new String("Hello"); // Using a constructor
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String s3 = new String(chars);  // Using a character array
```

## Concatenating strings:
Strings can be concatenated in Java using the `+` operator.

```java
String s1 = "Hello";
String s2 = "World";
String s3 = s1 + " " + s2; // s3 will be "Hello World"
```

## Getting the length of a string:
The `length()` method can be used to get the length of a string.

```java
String s = "Hello";
int length = s.length(); // length will be 5
```

## Accessing characters in a string:
Individual characters in a string can be accessed using the `charAt()` method.

```java
String s = "Hello";
char c = s.charAt(0); // c will be 'H'
```
## Comparing strings:
Strings can be compared in Java using the `equals()` method.

```java
String s1 = "Hello";
String s2 = "World";
boolean equal = s1.equals(s2); // equal will be false
```

## Searching for substrings:
The `indexOf()` method can be used to search for substrings in a string.

```java
String s = "Hello World";
int index = s.indexOf("World"); // index will be 6
```

## Modifying strings:
Strings in Java are immutable, which means that once a string is created, it cannot be modified. However, new strings can be created by manipulating existing strings.

```java
String s1 = "Hello";
String s2 = s1 + " World"; // s2 will be "Hello World"
```

## Converting strings to other types:
Strings can be converted to other types in Java using the parse methods of the wrapper classes.

```java
String s = "123";
int i = Integer.parseInt(s); // i will be 123
```

## Formatting strings:
Strings can be formatted in Java using the printf() method.

```java
String name = "Alice";
int age = 30;
System.out.printf("My name is %s and I am %d years old.", name, age);
// Output: My name is Alice and I am 30 years old.
```
These are some of the most common operations that can be performed on strings in Java. 
With this knowledge, you should be able to start working with strings in your Java programs.


## All the String methods and functions in Java with code examples:

1. `charAt(int index)`: Returns the character at the specified index.

```java
String str = "Hello";
char ch = str.charAt(0); // ch will be 'H'
```

2. `codePointAt(int index)`: Returns the Unicode code point at the specified index.

```java
String str = "Hello";
int codePoint = str.codePointAt(1); // codePoint will be 101 (Unicode value for 'e')
```

3. `codePointBefore(int index)`: Returns the Unicode code point before the specified index.

```java
String str = "Hello";
int codePoint = str.codePointBefore(1); // codePoint will be 72 (Unicode value for 'H')
```

4. `codePointCount(int beginIndex, int endIndex)`: Returns the number of Unicode code points in the specified range.

```java
String str = "Hello";
int codePointCount = str.codePointCount(0, 3); // codePointCount will be 3
```

5. `compareTo(String anotherString)`: Compares two strings lexicographically.

```java
String str1 = "Hello";
String str2 = "hello";
int result = str1.compareTo(str2); // result will be -32
```

6. `compareToIgnoreCase(String str)`: Compares two strings lexicographically, ignoring case differences.

```java
String str1 = "Hello";
String str2 = "hello";
int result = str1.compareToIgnoreCase(str2); // result will be 0
```

7. `concat(String str)`: Concatenates the specified string to the end of the current string.

```java
String str1 = "Hello";
String str2 = " World!";
String str3 = str1.concat(str2); // str3 will be "Hello World!"
```

8. `contains(CharSequence sequence)`: Returns true if the current string contains the specified sequence.

```java
String str = "Hello World!";
boolean contains = str.contains("Hello"); // contains will be true
```

9. `contentEquals(CharSequence sequence)`: Returns true if the current string and the specified sequence are equal.

```java
String str = "Hello";
StringBuilder sb = new StringBuilder("Hello");
boolean isEqual = str.contentEquals(sb); // isEqual will be true
```

10. `endsWith(String suffix)`: Returns true if the current string ends with the specified suffix.

```java
String str = "Hello World!";
boolean endsWith = str.endsWith("World!"); // endsWith will be true
```

11. `equals(Object anObject)`: Returns true if the current string is equal to the specified object.

```java
String str1 = "Hello";
String str2 = "Hello";
boolean isEqual = str1.equals(str2); // isEqual will be true
```

12. `equalsIgnoreCase(String anotherString)`: Returns true if the current string is equal to the specified string, ignoring case differences.

```java
String str1 = "Hello";
String str2 = "hello";
boolean isEqual = str1.equalsIgnoreCase(str2); // isEqual will be true
```

13. `format(String format, Object... args)`: Returns a formatted string using the specified format string and arguments.

```java
String name = "John";
int age = 30;
String message = String.format("My name is %s and I am %d years old.", name, age);
System.out.println(message); // Output: My name is John and I am 30 years old.
```

14. `getBytes()`: Encodes the current string into a sequence of bytes using the platform

```java
String str = "Hello";
byte[] bytes = str.getBytes(); // bytes will contain the ASCII values of 'H', 'e', 'l', 'l', 'o'
```

15. `getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)`: Copies characters from the current string to a destination character array.

```java
String str = "Hello";
char[] dest = new char[3];
str.getChars(0, 3, dest, 0); // dest will contain 'H', 'e', 'l'
```

16. `indexOf(int ch)`: Returns the index of the first occurrence of the specified character.

```java
String str = "Hello World!";
int index = str.indexOf('o'); // index will be 4
```

17. `indexOf(int ch, int fromIndex)`: Returns the index of the first occurrence of the specified character starting from the specified index.

```java
String str = "Hello World!";
int index = str.indexOf('o', 5); // index will be 7
```

18. `indexOf(String str)`: Returns the index of the first occurrence of the specified string.

```java
String str = "Hello World!";
int index = str.indexOf("World"); // index will be 6
```

19. `indexOf(String str, int fromIndex)`: Returns the index of the first occurrence of the specified string starting from the specified index.

```java
String str = "Hello World!";
int index = str.indexOf("World", 7); // index will be -1 (not found)
```
