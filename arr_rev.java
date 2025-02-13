// public class arr_rev {

//     public static void rev(int numbers[]){
//         int start=0, last = numbers.length-1;
//         int temp;
//         while(start<last){
//             temp = numbers[start];
//             numbers[start]= numbers[last];
//             numbers[last] = temp;
//             start++;
//             last--;
//         }
//     }
// public static void main(String[] args) {
//     int numbers[]={1, 2, 3, 4, 5};
//     rev(numbers);
//     for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//     }
// }    
// }

import java.util.*;
public class arr_rev {

    public static void rev(int arr[]){
        int start = 0;
        int last = arr.length-1;
        int temp;

        while(start<last){
            temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       int numbers[] = {1, 2, 3, 4, 5};
       rev(numbers);
    }
}
