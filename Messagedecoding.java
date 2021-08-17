package JavaLeetcode;

import java.util.Locale;
import java.util.SortedMap;

public class Messagedecoding {
    public static void main(String[] args) {
        String s = "hlelo";
        char a[] = {'h','e','l','l','o'};
        s = s.toLowerCase();
        int index = 0;
        for(char c:s.toCharArray()){
            if(a[index] == c){
                index++;
            }
            if(index == a.length)
                break;
        }
        System.out.println(index);

    }
}
