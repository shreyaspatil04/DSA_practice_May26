package avd_array;

import java.util.HashMap;

public class find_repeating_element {
    static void main() {
        int[] arr = {1,3,4,5,6,3,2,1,5};

        HashMap<Integer,Integer> map =  new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(var entry : map.entrySet()){

            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
