public class arr_linearSearch {

    public static int linSer(int numbers[], int key){
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1 ;
    }
    public static void main(String args[]) {
        int numbres[]= {15, 17, 19, 21, 23, 25, 27, 29, 31, 33 };
        int key = 17;
        int index = linSer(numbres, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(key+" is at index:- "+index);
        }
    }
    
}
