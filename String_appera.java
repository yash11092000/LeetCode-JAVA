package JavaLeetcode;

public class String_appera {
    public static void main(String[] args) {
       String[]  patterns = {"a","b","c"};
       String word = "aaaaabbbbb";
       int count = 0;
       for(String i:patterns){
           if(word.contains(i)){
               count++;
           }
       }
        System.out.println(count);
    }
}
