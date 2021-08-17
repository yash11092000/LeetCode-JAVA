package JavaLeetcode;

public class findElementinrotatearray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        int pivot = 0;
        int key = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                pivot = i;
            }
        }
        if(arr[pivot]>key){
            System.out.println(bin(arr,pivot+1, arr.length,key));
        }
        else{
            System.out.println(bin(arr,0,pivot,key));
        }
    }
    public static int bin(int[] arr,int start,int end,int key){
            int mid = (start+end)/2;
                if(arr[mid] == key){
                    return mid;
                }
                else if(arr[mid]<key){
                    bin(arr,mid+1,end,key);
                }
                else{
                    bin(arr,start,mid,key);
                }
                return -1;
    }
}
