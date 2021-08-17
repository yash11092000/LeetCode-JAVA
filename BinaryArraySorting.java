package JavaLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int n = 10;
        int a[] = {0,1,1,0,1,0};
        int zerocount = 0;
        int onecount = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) zerocount++;
            else onecount++;
        }
        int k = 0;
        for (int i=0;i<zerocount;i++) a[k++]=0;
        for (int i=0;i<onecount;i++) a[k++]=1;

        System.out.println(Arrays.toString(a));
    }
}
