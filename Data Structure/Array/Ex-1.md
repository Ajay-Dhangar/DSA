
## Write a program to reverse an array or string.

#### Given an array (or string), the task is to reverse the array/string.
### Examples : 
  - intput = 1 2 3 4 5
  - output = 5 4 3 2 1 
 
#### To reverse an array or a string in Java, you can use the following approach:

- Initialize two variables, `Start` and `End`, to the start and end indices of the array or string.
- While `Star`t is less than `End`, swap the elements at indices `Start` and `End`, and increment `Start` and decrement `End`.
- Return the reversed array or string.
- Here is an example of how you can implement this approach in Java to reverse an array:


### `JAVA`
 
```Java []

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

### `C++`
```c++
// Iterative C++ program to reverse an array
#include <bits/stdc++.h>
using namespace std;

/* Function to reverse arr[] from start to end*/
void rvereseArray(int arr[], int start, int end)
{
	while (start < end)
	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}
}	

/* Utility function to print an array */
void printArray(int arr[], int size)
{
for (int i = 0; i < size; i++)
cout << arr[i] << " ";

cout << endl;
}

/* Driver function to test above functions */
int main()
{
	int arr[] = {1, 2, 3, 4, 5, 6};
	
	int n = sizeof(arr) / sizeof(arr[0]);

	// To print original array
	printArray(arr, n);
	
	// Function calling
	rvereseArray(arr, 0, n-1);
	
	cout << "Reversed array is" << endl;
	
	// To print the Reversed array
	printArray(arr, n);
	
	return 0;
}

```
### `python`
```python
# Iterative python program to reverse an array

# Function to reverse A[] from start to end
def reverseList(A, start, end):
	while start < end:
		A[start], A[end] = A[end], A[start]
		start += 1
		end -= 1

# Driver function to test above function
A = [1, 2, 3, 4, 5, 6]
print(A)
reverseList(A, 0, 5)
print("Reversed list is")
print(A)
# This program is contributed by Pratik Chhajer

```

## _Keep Learning_
