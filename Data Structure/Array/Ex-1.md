
## Write a program to reverse an array or string.

#### Given an array (or string), the task is to reverse the array/string.
###Examples : 
  arr[] = 1 2 3 4 5
  output = 5 4 3 2 1 
 
 
 ``` [] java
public class Ex-1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // n=5
        System.out.println("\n");
        System.out.println("Print current array: ");
        PrintArray(arr, 5); // function call for print current array       
        ReverseArray(arr, 0, 4); // function call for reverse array
        System.out.println("Print Reverse array: "); // print enter value
        PrintArray(arr, 5); // function call for print Reverse array
    }
// colling function for print array
    private static void PrintArray(int[] arr, int n) {
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
// colling function for reverse array
    private static void ReverseArray(int[] arr, int start, int end) {
        int temp = 0;
        if(start>=end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        ReverseArray(arr, start+1, end-1);
    }
}

```
