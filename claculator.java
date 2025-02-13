import java.util.*;
public class claculator {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number:- ");
     int x = sc.nextInt();
     System.out.println("Enter second number:- ");
     int y = sc.nextInt();
     System.out.println("Enter the operation:- ");
     int z = sc.next().charAt(0);

     switch (z) {
        case '+': System.out.println(x+y);
            break;
        case '-': System.out.println(x-y);
            break;
        case '*' : System.out.println(x*y);        
            break;
        case '/' : System.out.println(x/y);
            break;
        case '%' : System.out.println(x%y);
            break;
        default: System.out.println("Wrong Character");
            break;
     }
}
}