import java.util.*;
public class fun_factorial {

    public static int factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
            
        }
        return fact;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:= ");
    int x= sc.nextInt();
    System.out.print("The factorial of the number is:- "+ factorial(x));
}    
}
