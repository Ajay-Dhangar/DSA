
// WAP to print the fibonacci sequence till nth term with the help of recurtion

public class Recursion6 {
    public static void main(String[] args) {
        int i=0, j=1;  // first two variable
        System.out.print(i+" "); 
        System.out.print(j+" ");
        int n=5;
        fibo(i, j, n-1); // mathod
        
    }

    private static void fibo(int i, int j, int n) {
        if(n==0){
            return; // condition
        }
        int k = i+j; // farmula's
        System.out.print(k+" "); // print
        fibo(j, k, n-1); // again function calling
    } 
        
}
