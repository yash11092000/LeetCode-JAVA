package JavaLeetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = {2,1,5,3};
        int target = 6;
//        Arrays.sort(a);
//        int i=0,j=a.length-1;
//        int flag = 0;
//        while (i<j){
//            if(a[i]+a[j]==key){
//                flag = 1;
//                System.out.println(a[i]+" "+a[j]);
//                break;
//            }
//            else if(a[i]+a[j]>key){
//                j--;
//            }
//            else if(a[i]+a[j]<key){
//                i++;
//            }
//        }
//        if(flag==0){
//            System.out.println(-1);
//        }
//        int flag = 0;
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]+a[j]==key){
//                    System.out.println(i+" "+j);
//                    flag = 1;
//                    break;
//                }
//            }
//        }
//        if (flag==0)
//            System.out.println(-1);
        Map<Integer,Integer> num_map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int compliment = target - a[i];
            if(num_map.containsKey(compliment)){
                System.out.println(num_map.get(compliment)+" "+i);
                break;
            }
            else{
                num_map.put(a[i],i);
            }
        }
    }
}
