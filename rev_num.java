import java.util.*;
public class rev_num {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int x = sc.nextInt();
    int rev = 0;
    while(x>0){
        int last_digit = x%10;
        rev = (rev*10)+last_digit;
        x=x/10;
    }
    System.out.println(rev);
}    
}
