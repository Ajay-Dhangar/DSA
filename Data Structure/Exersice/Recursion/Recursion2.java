
// print number 1 to 5 with the help of Recursion

public class Recursion2 {
    public static void main(String[] args) {
        int n=1;
        print(n); // mathod Or function calling
    }

    private static void print(int n) {
        if(n>5){
            return;
        }
        System.out.print(n +" ");
        print(n+1);
    }
}
