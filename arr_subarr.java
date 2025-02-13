public class arr_subarr {

public static void subarr(int numbers[]){
    int ts=0;
    for(int i=0;i<numbers.length;i++){
        
        for(int j=i;j<numbers.length;j++){
            
            for(int k=i;k<=j;k++){
                System.out.print(numbers[k]+" ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Total sub arrays:- "+ts);
}
    public static void main(String[] args) {
        int numbers[]= {9,2,7,6};
        subarr(numbers);
    }
}
