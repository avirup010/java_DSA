public class arr_opti_maxSum {

        public static void max_arr(int numbers[]){
            int max_sum=Integer.MIN_VALUE;
            int prefix[]= new int [numbers.length];
            prefix[0]=numbers[0];
            for(int i=1;i<prefix.length;i++){
                prefix[i]=prefix[i-1]+numbers[i];
            }
            for(int i=0;i<numbers.length;i++){
                for(int j=i;j<numbers.length;j++){
                   int currSum=0;
                    
                        currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                        if(max_sum<currSum){
                            max_sum=currSum;
                    }
                }
            }
            System.out.println("The max sum of sub array is:- "+max_sum);
        }
       public static void main(String[] args){
        int numbers[]={1,-2,6,-1,3};
        max_arr(numbers);
       } 
    }
    
