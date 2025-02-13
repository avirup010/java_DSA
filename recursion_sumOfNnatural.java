import java.util.*;
public class recursion_sumOfNnatural {

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s = sum(n-1);
        int ts = n+sum(n-1);
        return ts;
    }
public static void main(String[] args) {
    int n =5;
    System.out.println(sum(n));
}   
}
