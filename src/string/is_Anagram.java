package string;

import java.util.HashMap;

public class is_Anagram {
    static void main() {
        String s = "abcd";
        String t = "cbac";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }

    static boolean isAnagram(String s , String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch)-1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
