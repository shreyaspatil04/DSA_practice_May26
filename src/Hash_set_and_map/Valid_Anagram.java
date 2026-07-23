package Hash_set_and_map;

import java.util.HashMap;

public class Valid_Anagram {
    static void main() {
        String s1 ="listen";
        String s2 ="silent";
        boolean ans = isAnagram(s1,s2);
        System.out.println(ans);
    }

    static boolean isAnagram(String s1 , String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> map  = new HashMap<>();

        for (char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char d : s2.toCharArray()){
            if(!map.containsKey(d)){
                return false;
            }
            map.put(d, map.get(d)-1);

            if(map.get(d)==0){
                map.remove(d);
            }
        }

        return map.isEmpty();
    }
}
