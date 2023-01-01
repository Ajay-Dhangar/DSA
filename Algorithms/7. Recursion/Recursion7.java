
// print x^n (stack height n) with the help of recursion

/*
 * x^n = x*x*x*.........n times.
 * 1. given x's, and n's value
 * 2. target x^n = x*(x^(n-1)) = x^n
 * 3. we know x^0=1 and if x=o then x^n=0
 */

public class Recursion7 {
    public static void main(String[] args) {
        int x=5, n=3;
        int ans=cal(x,n);
        System.out.println(ans);
    }

    private static int cal(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int power = cal(x, n-1);
        int ans = x*power;
        return ans;
    }
}
