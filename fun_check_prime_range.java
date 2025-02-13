import java.util.*;
public class fun_check_prime_range {
    
    public static boolean check_prime(int n){
    
        if(n<=1){
            return false;
        }
        
        
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(check_prime(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int x = sc.nextInt();
        sc.close();
        System.out.println(check_prime(x));
        primeRange(x);
    
    }    
    }
    
