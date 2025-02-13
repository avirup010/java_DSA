import java.util.*;
public class recursion_IsArraySorted {

    public static boolean IsArray(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return IsArray(arr, i+1);
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4};
    System.out.println(IsArray(arr, 0));
}    
}
