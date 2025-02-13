// import java.util.*;
// public class oddsum_evensum {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int odd_sum = 0;
//     int even_sum = 0;
//     int choice;
//     do{
//         System.out.println("Enter the number:- ");
//         int x = sc.nextInt();
//         if(x%2==0){
//             even_sum+=x;
//         }else{
//             odd_sum+=x;
//         }
        
//         System.out.println("Do you want to continue?press 1 else 0");
//         choice=sc.nextInt();

//     }
//     while(choice==1);
//     System.out.println("odd sum = "+odd_sum);
//     System.out.println("even sum = "+even_sum);
// }    
// }





import java.util.*;
public class oddsum_evensum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd=0, even =0;
        int choice;

        do{
            
            System.out.println("Enter the Number:- ");
            int n = sc.nextInt();
            if(n%2==0){
                even = even+n;
            }else{
                odd= odd+n;
            }

            System.out.println("Do you Want to continue, press 1 else 0:- ");
            choice = sc.nextInt();
            // sc.close();
        }
        while(choice ==1);

        System.out.println("Even Sum = "+even);
        System.out.println("odd sum = "+odd);
    }
}




// import java.util.Scanner;
// public class oddsum_evensum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.print("Enter the number ");
// number = sc.nextInt();
// if( number % 2 == 0) {
// evenSum += number;
// } else {
// oddSum += number;
// }
// System.out.print("Do you want to continue? Press 1 for yes or 0 forno");
// choice = sc.nextInt();
// } while(choice==1);
// System.out.println("Sum of even numbers: " + evenSum);
// System.out.println("Sum of odd numbers: " + oddSum);
// }
// }
