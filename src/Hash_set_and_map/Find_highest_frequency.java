package Hash_set_and_map;

import java.util.HashMap;
import java.util.Map;

public class Find_highest_frequency {
    static void main() {
        int[] arr = {12,13,14,12,13,15,16,14,16,18,19,20,13};
        HashMap<Integer,Integer> map_name = new HashMap<>();

        for ( int n:arr){
            map_name.put(n, map_name.getOrDefault(n,0)+1);
        }

        int maxFrequency = 0;
        int max_Konti_key = -1;

        for(Map.Entry<Integer,Integer> entry : map_name.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                max_Konti_key = entry.getKey();
            }
        }

        System.out.println("key:"+max_Konti_key+" frequency: "+maxFrequency);
    }
}
