
// print number 5 to 1 with the help of Recursion

public class Recursion1 {
    public static void main(String[] args) {
        int n=5; // initialization variaber
        print(n); // function calling OR mathod
    }

    private static void print(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
}
