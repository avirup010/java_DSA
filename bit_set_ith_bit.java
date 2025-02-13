import java.util.*;
public class bit_set_ith_bit {

    public static int set_bit(int n,int i){
        int bit = 1<<i;
        return n | bit;
    }
public static void main(String[] args) {

    System.out.println(set_bit(10, 2));
    
}    
}
