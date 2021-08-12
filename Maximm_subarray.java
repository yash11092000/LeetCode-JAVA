package JavaLeetcode;

public class Maximm_subarray {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,4,1,-5,4};
        int curr = 0;
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(curr<0){
                curr = 0;
            }
            curr+=a[i];
            max = Math.max(max,curr);
        }
        System.out.println(max);
    }
}
