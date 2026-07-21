package Hash_set_and_map;

import java.util.HashMap;
import java.util.Map;

public class Learning_hashMap {
    static void main() {
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(1,"shreyas");
//        map.put(2,"nidhi");
//        map.put(3,"shivBala");
//        map.put(4,"krishaBala");
//
//        System.out.println(map);

        int[] arr = {12,13,14,12,13,15,16,14,16,18,19,20,13};
        HashMap<Integer,Integer> map = new HashMap<>();

         for (int n : arr){
             map.put(n, map.getOrDefault(n,0)+1);
         }

         // entryset
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

    }
}
