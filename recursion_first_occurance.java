import java.util.*;
public class recursion_first_occurance {

    public static int firstOccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
public static void main(String[] args) {
    int arr[] = {1,2,3,5,8,6,7,8,9,7,4};
    System.out.println(firstOccurance(arr, 5, 0));

}    
}
