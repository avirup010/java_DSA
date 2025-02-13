import java.util.*;
public class recursion_titlingProb {

    public static int tilingWays(int n){
        if( n==0 || n==1){
            return 1;
        }
        int fnm1 = tilingWays(n-1);
        int fnm2 = tilingWays(n-2);
        int total = fnm1+fnm2;
        return total;
    }
 public static void main(String[] args) {
    System.out.println(tilingWays(4));
 }   
}
