package JavaLeetcode;
import java.util.Arrays;

public class Mergetwosortedarrays {
    public static void main(String[] args) {
        int b[] = {1,2,4,7,8,10};
        int a[] = {3,5,11};
        int c[] = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i];
                i++;
            }
            else if(a[i]>b[j]){
                c[k++] = b[j];
                j++;
            }
        }
        System.out.println(i+" "+j+" "+k);
        System.out.println(Arrays.toString(c));
        if(j==b.length){
            while (i<a.length){
                c[k++] = a[i];
                i++;
            }
        }
        else{
            while (j<b.length){
                c[k++] = b[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(c));



    }
}
