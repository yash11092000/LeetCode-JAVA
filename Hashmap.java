package JavaLeetcode;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap();
        hm.put(1,2);
        hm.put(3,4);
        hm.put(5,6);
        for(int i:hm.keySet()){
            System.out.println(i);
        }
        System.out.println(hm.size());
    }
}
