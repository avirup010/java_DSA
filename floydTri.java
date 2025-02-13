import java.util.*;
public class floydTri {

    public static void fly(int n){
        int num =1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows:- ");
    int x = sc.nextInt();
    fly(x);
}    
}
