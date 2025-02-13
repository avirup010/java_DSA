import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen:- ");
        float x = sc.nextFloat();
        System.out.println("Enter the cost of pencil:- ");
        float y = sc.nextFloat();
        System.out.println("Enter the cost of earaser:- ");
        float z = sc.nextFloat();
        System.out.println("Total sum :- ");
        float sum = x+y+z;
        System.out.println(sum);
        System.out.println("Adding 18 percent gst:- ");
        float final_amount = ((sum) + (sum*18)/100);
        System.out.println(final_amount);
    }
}
