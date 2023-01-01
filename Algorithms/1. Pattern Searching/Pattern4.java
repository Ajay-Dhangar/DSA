
/*print the pattern (Inverted Half pyramid)
    * * * * 
    * * * 
    * * 
    * 
*/
public class Pattern4 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
