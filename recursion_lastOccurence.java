import java.util.*;
public class recursion_lastOccurence {

    public static int LastOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        LastOccur(arr, key, i+1);
            if(LastOccur(arr, key, i+1)==-1 && arr[i]==key){
                return i;
            }
            return LastOccur(arr, key, i+1);
        }
    
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,5,9};
    System.out.println(LastOccur(arr, 5, 0));
    
}    
}
