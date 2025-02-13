import java.util.*;
public class insertionSort {

    public static void insertion(int numbers[]){
        int temp;
        for(int i =1;i<numbers.length;i++){
            temp = numbers[i];
            int j =i-1;
            while(j>=0 && numbers[j]>temp){
                numbers[j+1]= numbers[j];
                j--;
            }
            numbers[j+1]=temp;
        }
    }

    public static void sort (int numbers[]){
        insertion(numbers);
        for(int i =0; i<numbers.length;i++){
            
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]= {5,4,7,1,2,9};
        
        sort(numbers);
        
        }
    }
    
