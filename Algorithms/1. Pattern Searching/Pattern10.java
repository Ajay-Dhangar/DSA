
/*print the pattern (solid pattern)
       * * * * 
      * * * * 
     * * * * 
    * * * * 
   * * * *
*/
public class Pattern10 {
    public static void main(String[] args) {
      int n=5;
      for(int i=1; i<=n; i++){
         for(int j=i; j<n; j++){
            System.out.print("  ");
         }
         for(int j=1; j<n; j++){
            System.out.print("* ");
         }
         System.out.println();
      }
    }
}
