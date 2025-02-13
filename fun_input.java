import java.util.*;
public class fun_input {

    public static int sum_2_num(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:- ");
    int x = sc.nextInt();
    System.out.println("Enter second number:- ");
    int y = sc.nextInt();
    System.out.println("The sum is:- ");
    int sum = sum_2_num(x,y);
    System.out.println(sum);
}    
}
