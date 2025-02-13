import java.util.*;
public class sum_first_n_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:- ");
        int x = sc.nextInt();
        int sum =0;
        int i=1;
        while(i<=x){
            sum=sum+i;
            i++;
        }
        
        System.out.println(sum);
    }
    
}
