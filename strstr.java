package JavaLeetcode;

public class strstr {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "Fr";
        boolean isthere = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == x.charAt(0)){
                System.out.println("in");
                isthere = true;
                for(int j=0;j<x.length();j++){
                    if(s.charAt(i) != x.charAt(j)){
                        isthere = false;
                    }
                    i++;
                }
            }
        }
        if (isthere){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
