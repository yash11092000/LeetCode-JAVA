package JavaLeetcode;
import java.util.Arrays;
import java.util.Scanner;

public class weight_of_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int sum1 = weight(s1);
        int sum2 = weight(s2);
        System.out.println(sum1);
        System.out.println(sum2);
        if(sum1>sum2){
            System.out.println(1);
        }
        else if(sum2>sum1){
            System.out.println(2);
        }
        else{
            System.out.println("equal");
        }
    }
    public static int weight(String s){

        int[] a = new int[26];

        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                for(int j=0;j<a[i];j++){
                    sum+=i+1;
                }
            }
        }
        return sum;
    }
}
