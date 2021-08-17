package JavaLeetcode;

public class Removechar {
    public static void main(String[] args) {
        String a = "occurrence";
        String b = "car";
        for(char ch:b.toCharArray()){
            a = a.replace(ch,',');
        }
        System.out.println(a);
        String ans = "";
        for(char ch:a.toCharArray()){
            if(ch==','){
                continue;
            }
            ans+=Character.valueOf(ch);
        }
        System.out.println(ans);
    }
}
