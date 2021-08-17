package JavaLeetcode;

import java.util.Arrays;

public class check_if_string_is_isogram {
    public static void main(String[] args) {
        String s = "geeks";
        int a[] = new int[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        int flag = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>1){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("its isogram");
        }
        else{
            System.out.println("its not isogram");
        }
    }
}
