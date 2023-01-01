
// print factorial of n number with the help of Recursion

public class Recursion5 {
    public static void main(String[] args) {
        int n=5;  //Declaration and initialization of variable
        int ans=factorial(n); // //Declaration variable, initialization of mathod and assign value
        System.out.println(ans); // print answer
    }

    private static int factorial(int n) {  // create mathode 
        if(n==1 || n==0){  // condition if n is 0 or 1 then output is 1
            return 1; 
        }
        // if n is not (0 or 1) then output is n*(n-1)!
        int fact = factorial(n-1); // discretion of n's value
        fact = n*fact; // farmula's
        return fact; // return final answer to colling funcation Or mathod
    }
}
