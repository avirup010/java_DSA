import java.util.*;
public class deciToBinary {

    public static int Deci_bin(int n){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        return bin;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the decimal number:- ");
    int x = sc.nextInt();
    System.out.print("The Binary of "+x+" is:- "+Deci_bin(x));
}    
}
