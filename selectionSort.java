import java.util.*;
public class selectionSort {

    public static void selection(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int min = i;
            for(int j =i+1;i<numbers.length;j++){
                if(numbers[j]<numbers[min]){
                    min = numbers[j];
                }
            }
            if(min!= i){
               int temp = numbers[i];
               numbers[i] = numbers[min];
               numbers[min] = temp;
            }
        }
    }
public static void main(String args[]){
    int numbers[]= {7,5,1,8,3};

}    
}
