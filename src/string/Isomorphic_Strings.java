package string;

import java.util.HashMap;

public class Isomorphic_Strings {
    static void main() {
        String s ="noon";
        String t ="boob";
        boolean ans = is_isomorphic(s,t);
        System.out.println(ans);
    }

    static boolean is_isomorphic (String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(!map1.getOrDefault(c1,-1).equals(map2.getOrDefault(c2,-1))){
                return false;
            }

            map1.put(c1,i);
            map2.put(c2,i);
        }

        return true;
    }
}
