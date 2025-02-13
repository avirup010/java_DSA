import java.util.*;
public class recursion_nFriends_pairing {

    public static int nPairing(int n){

        if(n==1 || n==2){
            return n;
        }
        int fnm1 = nPairing(n-1);
        int fnm2 = (n-1)*nPairing(n-2);
        int total = fnm1+fnm2;
        return total;
    }
public static void main(String[] args) {
    System.out.println(nPairing(3));
    
}    
}
