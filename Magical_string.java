package JavaLeetcode;

public class Magical_string {
    public static void main(String[] args) {
        String s = "varun";
        String ans = "";
        for (char c:s.toCharArray()){
            int dis = c-'a';
            int val = 25-dis;
            val = 97+val;
            ans+=(char)val;
        }
        System.out.println(ans);
    }
}
