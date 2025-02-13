import java.util.*;
public class recursion_factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fmo= fact(n-1);
        int fon = n* fact(n-1);
        return fon;
    }
public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
}    
}
