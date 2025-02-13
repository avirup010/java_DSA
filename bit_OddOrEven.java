import java.util.*;
public class bit_OddOrEven {

    public static void Odd_Or_Even(int n){
        int bit = 1;
        if((n & bit)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Odd_Or_Even(3);
        Odd_Or_Even(10);
        Odd_Or_Even(18);
        Odd_Or_Even(17777);
    }
}
