package JavaLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int pre = 1;
        int res[] = new int[a.length];
        Arrays.fill(res,1);
        for(int i=0;i<a.length;i++){
            res[i] = pre;
            pre *= a[i];
        }
        int post = 1;
        for(int i=a.length-1;i>=0;i--){
            res[i] = post*res[i];
            post*=a[i];
        }
        System.out.println(Arrays.toString(res));

    }
}
