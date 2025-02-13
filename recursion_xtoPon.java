import java.util.*;
public class recursion_xtoPon {

    public static int xton(int x,int n){
        if(n ==0){
            return 1;
        }
    // int xnm1 = xton(x, n-1);
    // int xn = x*xnm1;
    // return xn ;

        return x*xton(x, n-1);
    }
public static void main(String[] args) {
    System.out.println(xton(2, 10));
    
}    
}
