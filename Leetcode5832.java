package JavaLeetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode5832 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        Arrays.sort(a);
        ArrayList<Integer> li = new ArrayList<>();
        int i=0;
        int j=a.length-1;
        while (li.size() != a.length){
            li.add(a[i]);
            i++;
            if(i<=j) {
                li.add(a[j]);
                j--;
            }
        }


    }
}
