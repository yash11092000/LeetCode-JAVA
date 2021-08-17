package JavaLeetcode;

import java.util.Arrays;

public class Sort_string {
    public static void main(String[] args) {
        String s = "aumvmceylngoulswauvqrnptwqweakyldrbrlhcappqsxjszvzpecchxohcbuerxefmgqddxfhphwhjobgadfpafaqfhtgedlcgmmmipgvymczagcbvgbilnmdsgvwgdwdgkbuswvvlpflmlgjbdosgpstwuqitoexhizupgkanvemmroedavqdjbypczkumyaclbqjslevujmqhoktytczllqdoroiacojlnezyakkxatqojsfzmfgvwuiwpxvvstlokqjoxptiyupqxaydskwbbqqoxekwyuoxagpaydjvkvrjuwjxvwvkfxipvzzodagtcmjikxmhlxwqwhupgewimrqkgewdmkbkrizdzlafbukolwxnmgllbwnywwkdmfjfmtlkqmyjfnyppzeuvqthyskdledgfvqsvqqrxrnbmzdawhqcuwouwslqnrzohwwgavyjmmfhltuqwpdtneksnrsrzuuqmwdnzlenbnshxgtvrxgf";
        int a[] = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        String ans = "";
//        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                for(int j=0;j<a[i];j++){
                    ans+=(char)('a'+i);
                }
            }
        }
        System.out.println(ans);
    }
}
