public class arr_max_subarr {
    public static void max_arr(int numbers[]){
        // int max_sum=Integer.MIN_VALUE;
        
        int ms =Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
               int currSum=0;
                for(int k =i;k<=j;k++){
                    currSum=currSum+numbers[k];     
                    }
                    System.out.println(currSum);
                //     if(max_sum<currSum){
                //         max_sum=currSum;
                // }
                ms= Math.max(ms, currSum);
            }
        }
        System.out.println("The max sum of sub array is:- "+ms);
        // System.out.println("The max sum of sub array is:- "+max_sum);
    }
   public static void main(String[] args){
    int numbers[]={2,4,6,8,10};
    max_arr(numbers);
   } 
}
