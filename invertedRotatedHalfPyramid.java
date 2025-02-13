import java.util.*;
public class invertedRotatedHalfPyramid {

    public static void invRotHollPyr(int num1){
        for(int i =1;i<=num1;i++){
            for(int j =1;j<=num1-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows:- ");
    int x = sc.nextInt();
    invRotHollPyr(x);
    
}    
}
