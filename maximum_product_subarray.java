package JavaLeetcode;

public class maximum_product_subarray {
    public static void main(String[] args) {
//        int a[] = {2,3,-2,4};
        int a[] = {-1,-2,-3};
        int maxprod = 1;
//         brute force
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int prod = 1;
                for(int k=i;k<j;k++){
                    prod = prod*a[k];
                    maxprod = Math.max(maxprod,prod);
                }
            }
        }
        System.out.println(maxprod);



    }
}
