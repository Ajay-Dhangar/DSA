
/*print the pattern (solid pattern)
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/
public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        // outer loop
        for(int i=n; i>=1; i--){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();           
        }
    }
}
