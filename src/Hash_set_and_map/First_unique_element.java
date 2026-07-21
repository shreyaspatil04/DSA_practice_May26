package Hash_set_and_map;

import java.util.HashMap;

public class First_unique_element {
    static void main() {
        String s = "leetcode";
        System.out.println(first_unique(s));
    }

    static char first_unique(String s){
        HashMap<Character,Integer> map =  new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '\0';
    }
}

// easy just see code no need of explanation.....