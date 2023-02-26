import java.util.Arrays;

public class Basic {
  public static void main(String[] args) {
    // Declare and initialize an array
    int[] arr = {5, 3, 9, 1, 7};

    // Access and modify array elements
    int element = arr[2];
    arr[2] = 10;

    // Find the length of an array
    int length = arr.length;

    // Sort an array
    Arrays.sort(arr);

    // Copy an array
    int[] copy = Arrays.copyOf(arr, arr.length);

    // Search for an element in an array
    int index = Arrays.binarySearch(arr, 5);

    // Fill an array with a value
    int[] filled = new int[5];
    Arrays.fill(filled, 0);

    // Concatenate arrays
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
    int[] arr3 = {7, 8, 9};
    int[] concatenated = Arrays.copyOf(arr1, arr1.length + arr2.length + arr3.length);
    System.arraycopy(arr2, 0, concatenated, arr1.length, arr2.length);
    System.arraycopy(arr3, 0, concatenated, arr1.length + arr2.length, arr3.length);

    // Convert an array to a string
    String str = Arrays.toString(arr);

    // Compare arrays
    int[] arr4 = {5, 3, 9, 1, 7};
    boolean isEqual = Arrays.equals(arr, arr4);

    // Print the results
    System.out.println("Original array: " + Arrays.toString(arr));
    System.out.println("Accessed element: " + element);
    System.out.println("Modified array: " + Arrays.toString(arr));
    System.out.println("Length of array: " + length);
    System.out.println("Sorted array: " + Arrays.toString(arr));
    System.out.println("Copied array: " + Arrays.toString(copy));
    System.out.println("Index of element 5: " + index);
    System.out.println("Filled array: " + Arrays.toString(filled));
    System.out.println("Concatenated array: " + Arrays.toString(concatenated));
    System.out.println("Array as string: " + str);
    System.out.println("Arrays equal? " + isEqual);
  }
}
