package avd_array;

import java.util.HashMap;

public class frequency_of_all {
    static void main() {
        int[]arr = {1,2,3,2,1,2,4,5,6,4,3,4,5,2,3,4,3,4};


        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        for  (var entry : map.entrySet() ){
            System.out.println(entry.getKey()+" --> "+ entry.getValue());
        }

    }
}
