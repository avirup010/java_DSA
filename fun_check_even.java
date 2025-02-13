import java.util.*;
public class fun_check_even {

    public static boolean isEven(int n){
    
        if(n%2==0){
            return true;
        }else{
            return false;
        }
        
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
         int x = sc.nextInt();
         if(isEven(x)){
            System.out.println(+x+" is Even");
         }else{
            System.out.println(x+" is odd");
         }
    
}
    
}