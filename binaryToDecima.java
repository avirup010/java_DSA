// import java.util.*;
// public class binaryToDecima {

//     public static int Bin_to_deci(int n){
//         int bin_num = n;
//         int dec = 0;
//         int pow = 0;
//         while(n>0){
//         int bin = n%10;
//         dec = dec +(bin*(int)Math.pow(2, pow));
//         pow++;
//         n=n/10;
//         }
//         return dec;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Binary Number :- ");
//     int x = sc.nextInt();
//     System.out.print("The Decimal of "+x+" is:- "+Bin_to_deci(x));
// }    
// }


import java.util.*;
public class binaryToDecima {

    public static void btod(int n){
        int binum = n;
        int dec =0;
        int pow =0;
        while(n>0){
            int bin=n%10;
            dec = dec+(bin*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
System.out.println(binum+" for binary num is "+dec);
    }
    public static void main(String[] args) {
        int n =101;
        btod(n);
    }
}
