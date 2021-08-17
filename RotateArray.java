package JavaLeetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}  ;
        int d = 4;
        int i = d;
        int j = arr.length-1;
        while (i>=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i--;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
