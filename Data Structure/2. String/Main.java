/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // 1. Creating a String

        // String s1 = "Hello"; // Using String literal
        // String s2 = new String("World"); // Using a constructor
        // System.out.println(s1);// s1 will be "Hello"
        // System.out.println(s2);// s2 will be "World"

        // 2. Concatenating

        // String can be concatenated in Java using `+` operator.

        // String s1 = "Hello";
        // String s2 = " ";
        // String s3 = "World";
        // String s4 = s1 + s2 + s3;
        // String firstName = "John";
        // String lastName = "Doe";

        // Using the + operator
        //String fullName1 = firstName + " " + lastName;
        
        // Using the concat() method
        //String fullName2 = firstName.concat(" ").concat(lastName);

        // System.out.println(s4); // s4 will be "Hello World"
        // System.out.println(fullName1);
        // System.out.println(fullName2);
        // 3. Getting the `length` of a String

        // The `length()` method can be used to get the length of  String

        // String s = "Hello";
        // int len = s.length();

        // System.out.println(len); // len will be 5

        // 4. Accessing charactors in a String

        // Individual charactors in a String can be accessed using `chrAt()` method.
        // String s = "Hello";
        // char ch = s.charAt(0); // ch will be 'H'
        
        // System.out.println(ch);
        
        // 5. Comparing strings:

        // String can be compared in java using `equals()` method.

        // String s1 = "Hello";
        // String str2 = "hello";
        // String s2 = "World";
        // String s3 = "Hello";
        // Using the equals() method
        // boolean equal = s1.equals(s2);// false
        // boolean eq = s1.equals(s3);// true
        // Using the compareTo() method
        //int result = s1.compareTo(str2); // result will be -32
        // System.out.println(equal);
        // System.out.println(eq);
        // System.out.println(result);

        // 6. Searching for substring

        // the `indexOf()` and `contains()`  method can be used to search for substrings in a String.
        
        // String s1 = "Hello World";
        // int index = s1.indexOf("World"); // index will be 6
        // boolean contains = s1.contains("Hello"); // contains will be true
        // System.out.println(index);
        // System.out.println(contains);
        
        // 7. Modifying String

        // String in Java are immutable, which mean that once a string is created, it cannot be modified. However, new string can be created by menipulating existing string.

        // String s1 = "Hello";
        // String str = "hello world";
        // String s2 = s1 + " " + "World";// s2 will be "Hello World"
        // String newStr = str.substring(0, 5).toUpperCase().concat(str.substring(5).replace("world", "Java"));
        // newStr will be "HELLO Java"
        // System.out.println(s2); // "hello world"
        // System.out.println(str); // "HELLO Java"

        // 8. Converting string to other types 

        // String can be converted to other types in jav using the parse methods of the wrapper classes.

        // String s = "123";
        // int num = Integer.parseInt(s); // num will be 123

        // System.out.println(num);

        // 9. Formatting String

        // String can be formatted in jav using the `String.format()` or `printf()` method.

        // String name = "Ajay";
        // int age = 22;
        // =================
        // String message = String.format("My name is %s and I am %d years old.", name, age);
        // System.out.println(message);
        // ====== OR ======
        // System.out.printf("My name is %s and I am %d years old.", name, age);
      
        // print will be "My name is Ajay and I am 22 years old."
    }
}