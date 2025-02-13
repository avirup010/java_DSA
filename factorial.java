import java.util.*;
public class factorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number :- ");
    int x = sc.nextInt();
    int fact =1;
    for(int i =1;i<=x;i++){
        fact*=i;
        
    }
    System.out.println(fact);

}    
}
