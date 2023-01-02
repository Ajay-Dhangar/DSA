
/*print the pattern (solid pattern)
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5 
  
*/

public class Pattern11 {
  public static void main(String[] args) {
    int n=5;
    for(int i=1; i<=n; i++){
      for(int j=n-i; j>=1; j--){
        System.out.print(" ");
      } 
      for(int j=1; j<=i; j++){
        System.out.print(i+ " ");
      }      
      System.out.println();
    }
  }    
}
