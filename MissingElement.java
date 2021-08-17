package JavaLeetcode;

public class MissingElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,5};
        int n = 5;
        int ans = 0;
        int currsum = 0;
        for (int i:a){
            currsum+=i;
        }
        ans = (n*(n+1))/2;
        System.out.println(ans-currsum);
    }
}
