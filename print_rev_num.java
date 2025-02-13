import java.util.*;
public class print_rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int x = sc.nextInt();
        while(x>0){
            int last_digit=x%10;
            System.out.print(last_digit);
            x= x/10;
           
        }  
        
    }
    
    
    
}
