import java.util.*;
public class bit_clear_ith_bit {

    public static int clearbit(int n, int i){
        int bit =~(1<<i);
        return (n&bit);
    }
public static void main(String[] args) {
    System.out.println(clearbit(10, 1));
}    
}
