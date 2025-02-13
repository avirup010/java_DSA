import java.util.*;
public class bit_updateBit {

    public static int clearBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int update(int n,int i,int newBit){
        n = clearBit(n, newBit);
        int bitMask = newBit << i;
        return n | bitMask;
    }
public static void main(String[] args) {
    System.out.println(update(10, 2, 1));
}    
}
