package JavaLeetcode;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_with_no_neighbour_avg {
    public static void main(String[] args) {
        int nums[] = {6,2,0,9,7};
        Arrays.sort(nums);
        ArrayList<Integer> li = new ArrayList<>();
        int i=0 ;
        int j=nums.length-1;
        while (li.size() != nums.length){
            li.add(nums[i++]);
            if(i<=j) {
                li.add(nums[j--]);
            }
        }
        Integer[] arr =  new Integer[li.size()];

    }

}
