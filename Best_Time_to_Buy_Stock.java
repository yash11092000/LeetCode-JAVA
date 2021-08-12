package JavaLeetcode;

public class Best_Time_to_Buy_Stock {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        int i=0,j=1;
//        left=buy right = sell
        int maxprofit = Integer.MIN_VALUE;
        while (j<a.length){
            if(a[i]<a[j]){
                maxprofit = Math.max(maxprofit,a[j]-a[i]);
            }
            else{
                i = j;
            }
            j++;
        }
        System.out.println(maxprofit);
    }
}
