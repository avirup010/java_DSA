import java.util.*;
public class opti_prime_num {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:- ");
    int x = sc.nextInt();

    

    if(x<2){
        System.out.println("Not Prime Number");
    }
    else{
        boolean is_prime = true;
        for(int i =2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                is_prime=false;
            }
        }
        if(is_prime==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}    
}
