public class arr_largest {
    public static int largesgt(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest > numbers[i]){
                smallest=numbers[i];
            }
            
        }
        System.out.println("The smallest number is:- "+smallest);
        return largest;

    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 7, 4, 5, -17, 25};
        System.out.println("largest Number is:- "+largesgt(numbers));
    }
}

// import java.util.*;
// public class arr_largest {

//     public static void lar(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i =0;i<arr.length;i++){
//             if(largest<arr[i]){
//                 largest=arr[i];
//             }
//             if(smallest>arr[i]){
//                 smallest=arr[i];
//             }
//         }
//         System.out.println(largest);
//         System.out.println(smallest);
//     }
//     public static void main(String[] args) {
//         int arr[]={1, 2, 7, 4, 5, -17, 25};
//         lar(arr);
//     }
// }