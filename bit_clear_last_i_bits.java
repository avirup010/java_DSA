import java.util.*;
public class bit_clear_last_i_bits {

    public static int clearBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
public static void main(String[] args) {
    System.out.println(clearBit(15, 2));
}    
}
