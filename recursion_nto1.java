import java.util.*;
public class recursion_nto1 {

    public static void PrintDecv (int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDecv(n-1);
    }
public static void main(String[] args) {
    int n = 10;
    PrintDecv(n);
}    
}
