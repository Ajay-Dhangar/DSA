
// print x^n (stack height logn) with the help of recursion

public class Recursion8 {
    public static void main(String[] args) {
        int x=5, n=3;
        int ans=cal(x,n);
        System.out.println(ans);
    }

    private static int cal(int x, int n) {
        if(n==0){
            return 1; // base case
        }
        if(x==0){
            return 0; // base case
        }
        // if n is even
        if(n%2==0){
            return cal(x, n/2)*cal(x, n/2);
        }
        else{
            return cal(x, n/2)*cal(x, n/2)*x;
        }
    }
}