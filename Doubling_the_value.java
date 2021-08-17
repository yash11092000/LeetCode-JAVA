package JavaLeetcode;

public class Doubling_the_value {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,8};
        int b = 3;
        for(int i=0;i<a.length;i++){
            if(a[i] == b){
                b*=2;
            }
        }
        System.out.println(b);
    }
}
