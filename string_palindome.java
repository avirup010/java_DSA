import java.util.*;
public class string_palindome {
    public static boolean check_pallindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Pallindrome");
        return true;
    }
    public static void main(String[] args) {
       String str = "noon";
       String str2 = "Nihal";
       check_pallindrome(str);
    }
}
