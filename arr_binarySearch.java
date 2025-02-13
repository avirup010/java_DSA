// public class arr_binarySearch {

//     public static int binse(int numbers[],int key){
//         int start = 0;
//         int end = numbers.length-1;
        
//         while(start<=end){
//             int mid = (start +end)/2;
//         if(key==mid){
//             return mid;
//         }
//         else if(key<numbers[mid]){
//             end = mid-1;
//         }
//         else{
//             start=mid+1;
//         }
//     }
//     return -1;
//     }
// public static void main(String[] args) {
//     int numbers[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//     int key = 5;


//     System.out.println("the index of "+key+" is:- "+binse(numbers, key));
// }    
// }


public class arr_binarySearch {

    public static int bin(int arr[],int key){
        int start = 0;
        int end = arr.length;
        for(int i =0;i<arr.length;i++){
            int mid = (start+end)/2;
        
        if(key==arr[mid]){
            return mid;
        }
        else if(key<arr[mid]){
            end = mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return 0;
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key =11;
        System.out.println(bin(arr, key));
    }
}