package JavaLeetcode;

public class keypad {
    public static void main(String[] args) {
        String ans = "";
        String s = "geeksquiz";
        int arr[] = { 2, 2, 2, 3, 3, 3 , 4, 4, 4, 5, 5, 5, 6, 6, 6, 7 , 7, 7, 7, 8 , 8, 8, 9, 9, 9, 9};
        for(int i=0;i<s.length();i++){
            ans+=arr[s.charAt(i)-'a'];
        }
        System.out.println(ans);
    }
}
