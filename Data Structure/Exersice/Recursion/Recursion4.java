
// print sum of first n natural number with the help of Recursion

public class Recursion4 {
    
    public static void main(String[] args) {
        Sum(1, 5, 0);
    }

    private static void Sum(int i, int n, int sum) {
        /*if i=5 and n is already 5.
           then condition is true

        */ 
        if(i==n){     
           sum += i;  //5.  sum=10+5=15
           System.out.println(sum); // 15
           return;
        } 
        /*if i is not equal 5 and n is already 5.
           then condition is false and go to next step           
        */ 
        sum += i;  
        /*sum = sum + i
        1. sum=0+1=1
        2. sum=1+2=3
        3. sum=3+3=6
        4. sum=6+4=10
        */  
        Sum(i+1, n, sum);

    }
}
