package JavaLeetcode;

import java.util.Arrays;

public class Strinsop {
    public static void main(String[] args) {
        String s1 = "1a3bc23";
        String str[]=s1.split("[a-z]+");
        long sum=0;
        System.out.println(Arrays.toString(str));
        for(int i = 0; i < str.length; i++){
            if(!str[i].equals(""))
                sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}