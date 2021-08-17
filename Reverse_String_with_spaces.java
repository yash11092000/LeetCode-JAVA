package JavaLeetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_String_with_spaces {
    public static void main(String[] args) {
        String s = "help others";
       char c[] = s.toCharArray();
       int i=0;
       int j=s.length()-1;
       while (i<j){
           if(Character.isWhitespace(c[i])){
               i++;
               continue;
           }
           else if(Character.isWhitespace(c[j])){
               j--;
               continue;
           }
           else{
               char temp = c[i];
               c[i] = c[j];
               c[j] = temp;

           }
           i++;
           j--;
       }
       String ans = new String(c);
        System.out.println(c);

    }
}
