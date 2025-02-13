import java.util.*;
public class recursion_optiXtoPoN {

    public static int optXtoN(int x,int n){
        if(n==0){
            return 1;
        }
        int halfP = optXtoN(x, n/2);
        int halfpSq = halfP*halfP;
        if(n%2 != 0){
            halfpSq =  x* halfpSq;
        }
        return halfpSq;

    }
public static void main(String[] args) {
    System.out.println(optXtoN(2, 5));
}    
}
