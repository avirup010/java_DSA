import java.util.*;
public class string_substring {

    public static String substr(String str,int start,int end){
      String  str2 = "";
    for(int i = start;i<end;i++){
       str2+= str.charAt(i);

    }
    return str2;
    }
public static void main(String[] args) {
    String str = "HelloWorld";
    System.out.println(str.substring(0,5));
    System.out.println(substr(str,0, 5));
}    
}
