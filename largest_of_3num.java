import java.util.*;
public class largest_of_3num {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number:- ");
        int x = sc.nextInt();

        System.out.println("Enter the second number:- ");
        int y = sc.nextInt();

        System.out.println("Enter the third number:- ");
        int z = sc.nextInt();

        System.out.println("The greatest number is:- ");

   if(x>y){
    if(x>z){
        System.out.println(x);
    }else{
        System.out.println(z);
    }
   }else{
    if(y>z){
        System.out.println(y);
    }else{
        System.out.println(z);
    }
   }     

}
}
