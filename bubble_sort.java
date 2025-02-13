import java.util.*;
public class bubble_sort {

    public static void bubble(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]= temp;
              

                }   
            }  
        }
    }

    public static void printArr(int numbers[]){
        for(int i =0;i<numbers.length;i++){
            bubble(numbers);
            System.out.println(numbers[i]+" ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    int numbers[] ={5,1,8,7,6};
    printArr(numbers);
  }  
}
