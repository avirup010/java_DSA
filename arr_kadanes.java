public class arr_kadanes {

    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = 0;
        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs>ms){
                ms = cs;
            }
            if(cs<0){
                cs = 0;
            }
        }
        System.out.println("Maximum array sum is:- "+ms);
    }
    public static void main(String[] args){
        int numbers[] ={-2,-3,4-1,-2,1,5,-3};
        // int numbers[]={-1,-2,-3,-4};
        kadanes(numbers);
    }
}

// import java.util.*;
// public class arr_kadanes {

//     public static void kad(int arr[]){
//         int cs =0;
//         int ms =0;
        
//         for(int i =0;i<arr.length;i++){
//             cs=cs+arr[i];
//             if(cs>ms){
//                 ms =cs;
//             }
//             if(cs<0){
//                 cs =0;
//             }
//         }
//         System.out.println(ms);
//     }
//     public static void main(String[] args) {
//         int arr[]={-2,-3,4-1,-2,1,5,-3};
//         kad(arr);
//     }
// }
