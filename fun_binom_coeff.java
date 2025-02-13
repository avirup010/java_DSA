    import java.util.*;
    public class fun_binom_coeff {

    public static int factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
            
        }
        return fact;
    }

    public static int binomcoff(int n, int r){
        int p = factorial(n);
        int b= factorial(r);
        int b2 = factorial(n-r);
        int bin_c = p/(b*b2);
        return bin_c;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number:= ");
    int x= sc.nextInt();
    System.out.print("Enter the second  number:= ");
    int y = sc.nextInt();
    System.out.println("The Binomial coeff of "+x+" base "+y +" is :- "+ binomcoff(x, y));
}    
}


