import java.util.*;
public class fun_sumOfdigits {  

    public static int sum(int n){
        int mynum = n;
        int ld =0;
        int num =0;
        while(n>0){
            ld = n%10;
            num = num+ld;
            n=n/10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int x = sc.nextInt();
        System.out.println("The sum of "+x+" is:- "+sum(x));

    }  
}
