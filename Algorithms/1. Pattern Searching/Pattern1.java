
/*print the pattern (solid pattern)
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4, m = 5;  // n is row and m is collomn
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 0; j < m; j++) {
                System.out.print("* "); // print * in only single line 
            }
            System.out.println(); // print next line
        }
    }
}
