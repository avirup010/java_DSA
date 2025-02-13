import java.util.*;
public class recursion_fibonacciSerries {

    public static int Fib(int n){

        if( n==0 || n==1){
            return  n;
        }
        int fibnm1 = Fib(n-1);
        int fibnm2 = Fib(n-2);
        int fibn = fibnm1+fibnm2;
        return fibn;
    }
    public static void main(String[] args) {
        int n =25;
        System.out.println(Fib(n));
    }
}
