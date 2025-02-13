// import java.util.*;
// public class recursion_removeDuplicateString {
// public static void remove_duplicate(String str,int index, StringBuilder newString, boolean map[] ){

// if(index == str.length()){
//     System.out.println(newString);
//     return;
// }

//     char currChar = str.charAt(index);
//     if(map[currChar -'a'] == true){
//         remove_duplicate(str, index+1, newString, map);
//     }
//     else{
//         map[currChar - 'a'] = true;
//         remove_duplicate(str, index+1, newString.append(currChar), map);
//     }
// }

// public static void main(String[] args) {
//     String str = "apnnaCollege";
//     remove_duplicate(str,0, new StringBuilder(""), new boolean[26]);
// }    
// }


import java.util.*;

public class recursion_removeDuplicateString {

    public static void remove_duplicate(String str, int index, StringBuilder newString, boolean map[]) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = Character.toLowerCase(str.charAt(index));
        if (map[currChar - 'a'] == true) {
            remove_duplicate(str, index + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            remove_duplicate(str, index + 1, newString.append(str.charAt(index)), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnnaCollege";
        remove_duplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
