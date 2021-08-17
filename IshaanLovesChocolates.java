package JavaLeetcode;

public class IshaanLovesChocolates {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 6, 9};
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(j>i){
            if(arr[j]>arr[i]){
                j--;
            }
            else if(arr[i]>=arr[j]){
                i++;
            }
        }
        System.out.println(arr[i]+" "+arr[j]);
    }
}
