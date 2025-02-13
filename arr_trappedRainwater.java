// import java.util.*;
// public class arr_trappedRainwater {

//     public static int rainWater(int numbers[]){
//         int leftMax[] = new int[numbers.length];
//         int rightMax[] = new int[numbers.length];
//         int trappedWater = 0;
//         leftMax[0]=numbers[0];
//         for(int i =1;i<numbers.length;i++){
//             leftMax[i]=Math.max(numbers[i],leftMax[i-1]);
//         }
        
//         rightMax[numbers.length-1] = numbers[numbers.length -1];  
//         for(int i=numbers.length -2;i>=0;i--){
//             rightMax[i]= Math.max(numbers[i],rightMax[i+1]);
//         }
        
//         for(int i=0;i<numbers.length;i++){

//         int waterlevel = Math.min(leftMax[i],rightMax[i]);
//         trappedWater += waterlevel-numbers[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String[] args) {
//         int numbers[]= {4,2,0,6,3,2,5};
//         System.out.println(rainWater(numbers));
//     }
// }



import java.util.*;
public class arr_trappedRainwater {

    public static int water(int arr[]){
        int leftmax[]= new int[arr.length];
        int rightmax[] = new int [arr.length];

        leftmax[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i], leftmax[i-1]);
        }
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
        }
        int trapwater =0;
        for(int i =0;i<arr.length;i++){
            int waterlevel= Math.min(leftmax[i], rightmax[i]);
            trapwater+=waterlevel-arr[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,6,3,2,5};
        System.out.println(water(arr));
    }
}