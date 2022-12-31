
// print n natural number with the help of Recursion

public class Recursion3 {
    public static void main(String[] args) {
        int n=1;
        print(n);
    }

    private static void print(int n) {
        if(n>10){
            return;
        }
        System.out.print(n + " ");
        print(n+1);
    }
}
