// import java.util.*;
// public class arr_input {

//     public static void update(int marks[]){
//         for(int i = 0;i<marks.length;i++){
//             marks[i]= marks[i]+1;
//         }
        
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter all the marks:- ");
//     int marks[] = new int[3];
    
//     for(int i=0;i<marks.length;i++){
//         marks[i] = sc.nextInt();
//         update(marks);
//         System.out.print(marks[i]+" ");
//     }  
    
// }    
// }


import java.util.*;
public class arr_input {

    public static void inp(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int marks []= new int[x];
        for(int i =0;i<marks.length;i++){
            marks[i]= sc.nextInt();
        }
        inp(marks);
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
