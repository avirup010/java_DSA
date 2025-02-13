import java.util.*;
public class bit_checkIsPowerOfTwo {

    public static boolean checkPower(int n){
    //     if((n & (n-1)) == 0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    return (n & (n-1))==0;
    }
public static void main(String[] args) {
    System.out.println(checkPower(8));
}    
}
