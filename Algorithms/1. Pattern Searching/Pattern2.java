
/*print the pattern (hollow Rectangle)
    * * * * *
    *       *
    *       *
    * * * * *
*/

public class Pattern2 {
    public static void main(String[] args) {
        int n = 4, m = 5;  // n is row and m is collomn
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 0; j < m; j++) {
                if(i==0 || j==0 ||  i==n-1 || j==m-1){
                    System.out.print("* "); // if condition is true then print *
                }
                else{
                    System.out.print("  "); // if condition is false then print space
                }
            }
            System.out.println(); // print next line
        }
    }
}