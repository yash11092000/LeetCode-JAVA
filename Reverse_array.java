package JavaLeetcode;

import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
