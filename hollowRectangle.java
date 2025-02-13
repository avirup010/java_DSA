import java.util.*;
public class hollowRectangle {

    public static void hollRec(int num1,int num2){
        

    for(int i =1;i<=num1;i++){
        for(int j=1;j<=num2;j++){
            if(i==1||i==num1||j==1||j==num2){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows:- ");
    int x = sc.nextInt();
    System.out.println("Enter no. of columns:- ");
    int y = sc.nextInt();
    hollRec(x,y);
    

}    
}
