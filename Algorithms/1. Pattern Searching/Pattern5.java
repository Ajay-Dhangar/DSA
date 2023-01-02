
/*print the pattern (solid pattern)
          *
        * *
      * * *
    * * * *
*/

public class Pattern5 {
  public static void main(String[] args) {
    int n = 4;
    // outer loop
    for (int i = 0; i < n; i++) {
      // first inner loop
      for (int j = n - 1; j >= i; j--) {
        System.out.print("  ");
      }
      // second inner loop
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
