import java.util.*;
public class arr_pairs {

    public static void pairs(int numbers[]){
        int tp=0;
        for(int i =0;i<numbers.length;i++){
            int curr= numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:- "+tp);
    }
  public static void main(String[] args) {
    int numbers[]= {1,7,8,45,78,96};
    pairs(numbers);
  }  
}