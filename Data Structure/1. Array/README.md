## What is an Array?

In programming, an array is a collection of elements of the same data type that are stored in a contiguous memory location. Each element in an array is accessed using an index or a subscript. Arrays are useful for storing and manipulating large amounts of data in a structured way.

 - An array is a collection of elements of the same data type, stored in contiguous memory locations.
 - Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
 - Arrays are indexed, meaning each element in an array has a unique index number associated with it.

## Mastering Arrays in Java: 

### A Comprehensive Guide to Methods and Functions for Efficient Programming

Arrays are one of the most fundamental data structures in Java. They allow you to store and manipulate a collection of elements of the same data type. Java provides several methods and functions to work with arrays, allowing you to perform various operations such as initialization, access, modification, searching, sorting, and copying.

### Declaring and Initializing Arrays:

Before you can use an array in Java, you need to declare and initialize it. You can declare an array by specifying its data type, followed by square brackets [] and the array name. You can then initialize the array with values using curly braces {} or by specifying the size of the array using the new keyword.

```java
int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = new int[5];
```

### Accessing and Modifying Array Elements:

You can access and modify elements of an array using the array index, which starts from 0. You can use the square brackets `[]` operator to access an element of the array. You can also modify the value of an element using the same operator.

```java
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr[0]); // Output: 1
arr[0] = 6;
System.out.println(arr[0]); // Output: 6
```

### Finding the Length of an Array:

You can find the length of an array using the length property of the array.

```java
int[] arr = {1, 2, 3, 4, 5};
int len = arr.length;
System.out.println(len); // Output: 5
```

### Sorting an Array:

Java provides the Arrays class with a `sort()` method to sort the elements of an array in ascending order. The `sort()` method uses the quicksort algorithm, which has an average time complexity of `O(n log n)`.

```java
int[] arr = {5, 3, 1, 4, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
```
### Copying an Array:

You can copy the elements of an array to another array using the `copyOf()` method of the Arrays class. The `copyOf()` method creates a new array with the specified length and copies the elements of the original array to the new array.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = Arrays.copyOf(arr1, arr1.length);
System.out.println(Arrays.toString(arr2)); // Output: [1, 2, 3]
```

### Searching for an Element in an Array:

You can search for an element in an array using the binarySearch() method of the Arrays class. The binarySearch() method returns the index of the element in the sorted array or a negative value if the element is not found. The array must be sorted before calling the binarySearch() method.

```java
int[] arr = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr, 3);
System.out.println(index); // Output: 2
```

### Filling an Array with a Value:

You can fill an array with a specific value using the fill() method of the Arrays class. The fill() method sets each element of the array to the specified value.

```java
int[] arr = new int[5];
Arrays.fill(arr, 10);
System.out.println(Arrays.toString(arr)); // Output: [10, 10, 10, 10, 10]
```

### Concatenating Arrays:

You can concatenate two or more arrays into a single array using the copyOf() method and the System.arraycopy() method of the System class. The copyOf() method is used to create a new array with the combined length of the original arrays, and the System.arraycopy() method is used to copy the elements of the original arrays to the new array.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {4, 5, 6};
int[] arr3 = {7, 8, 9};
int[] arr4 = Arrays.copyOf(arr1, arr1.length + arr2.length + arr3.length);
System.arraycopy(arr2, 0, arr4, arr1.length, arr2.length);
System.arraycopy(arr3, 0, arr4, arr1.length + arr2.length, arr3.length);
System.out.println(Arrays.toString(arr4)); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

### Converting Arrays to Strings:

You can convert an array to a string using the toString() method of the Arrays class. The toString() method returns a string representation of the array, which consists of the elements of the array enclosed in square brackets [] and separated by commas.

```java
int[] arr = {1, 2, 3, 4, 5};
String str = Arrays.toString(arr);
System.out.println(str); // Output: [1, 2, 3, 4, 5]
```

### Comparing Arrays:

You can compare two arrays for equality using the equals() method of the Arrays class. The equals() method compares the length and elements of the arrays for equality. If the arrays have the same length and elements, the method returns true; otherwise, it returns false.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean isEqual = Arrays.equals(arr1, arr2);
System.out.println(isEqual); // Output: true
```
Here's an example program that demonstrates 
1. [how to use all of the array methods and functions covered in the previous guide:](https://github.com/Ajay-Dhangar/DSA/blob/main/Data%20Structure/1.%20Array/Basic.java)

## some common array algorithms in Java for data structures and algorithms:

### 1. Linear Search:

This algorithm searches for a target value in an array by iterating through each element of the array, comparing it to the target value until it is found or until the end of the array is reached.

```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1; // target value not found in the array
}
```

### 2. Binary Search:

This algorithm is used to search for a target value in a sorted array. It repeatedly divides the array in half and compares the middle element with the target value until it is found or the subarray being searched becomes empty.

```java
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // target value not found in the array
}
```

### 3. Selection Sort:

This algorithm sorts an array by repeatedly finding the minimum element from the unsorted portion of the array and swapping it with the first element of the unsorted portion.

```java
public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
```

### 4. Insertion Sort:

This algorithm sorts an array by repeatedly inserting each element of the unsorted portion of the array into its correct position in the sorted portion of the array.

```java
public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
```

### 5. Bubble Sort:

This algorithm sorts an array by repeatedly swapping adjacent elements if they are in the wrong order until the array is sorted.

```java
public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

### 6. Merge Sort:

This algorithm sorts an array by dividing it into two halves, recursively sorting each half, and then merging the two sorted halves back together.

```java
public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

public static void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }
    while (i <= mid) {
        temp[k] = arr[i];
        i++;
        k++;
    }
    while (j <= right) {
        temp[k] = arr[j];
        j++;
        k++;
    }
    for (int m = 0; m < temp.length; m++) {
        arr[left + m] = temp[m];
    }
}
```

### 7. Quick Sort:

This algorithm sorts an array by selecting a pivot element, partitioning the array around the pivot so that all elements to the left of the pivot are less than or equal to it, and all elements to the right of the pivot are greater than it. Then it recursively sorts the left and right partitions.

```java
public static void quickSort(int[] arr, int left, int right) {
    if (left < right) {
        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }
}

public static int partition(int[] arr, int left, int right) {
    int pivot = arr[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[right];
    arr[right] = temp;
    return i + 1;
}
```

### 8. Counting Sort:

This algorithm sorts an array of integers by counting the number of occurrences of each element and using that information to reconstruct the sorted array.

```java
public static void countingSort(int[] arr, int k) {
    int[] count = new int[k + 1];
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }
    int index = 0;
    for (int i = 0; i < count.length; i++) {
        for (int j = 0; j < count[i]; j++) {
            arr[index] = i;
            index++;
        }
    }
}
```

### 9. Radix Sort:

This algorithm sorts an array of integers by sorting the elements one digit at a time, from the least significant digit to the most significant digit.

```java
public static void radixSort(int[] arr) {
    int max = getMax(arr);
    for (int exp = 1; max / exp > 0; exp *= 10) {
        countSort(arr, exp);
    }
}

public static int getMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static void countSort(int[] arr, int exp) {
    int[] output = new int[arr.length];
    int[] count = new int[10];
    for (int i = 0; i < arr.length; i++) {
        count[(arr[i] / exp) % 10]++;
    }
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }
    for (int i = arr.length - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }
    for (int i = 0; i < arr.length; i++) {
        arr[i] = output[i];
    }
}
```

### 10. Shell Sort:

This algorithm is a variation of insertion sort, where the array is sorted in subarrays of decreasing size, before finally sorting the entire array.

```java
public static void shellSort(int[] arr) {
    int n = arr.length;
    for (int gap = n / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                arr[j] = arr[j - gap];
            }
            arr[j] = temp;
        }
    }
}
```
## Conclusion

Arrays are a fundamental data structure in programming that allow you to store and manipulate collections of data in a structured way. Understanding how to declare, initialize, create, retrieve, and perform other operations on arrays is an important skill for any programmer.
