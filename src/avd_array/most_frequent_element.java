package avd_array;

import java.util.HashMap;

public class most_frequent_element {
    static void main() {
        int[] arr ={1,3,4,2,3,4,5,6,4,2,3,5,6,4,4,3,3,4,5,6,7,7,8,9,9,6,5,5,4,4,3,3,3,3,4,5,6,6,7,7};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int number = -1;
        int frequency = 0;

        for (var entry : map.entrySet()){

            if(entry.getValue()>frequency){
                frequency= entry.getValue();
                number = entry.getKey();
            }
        }

        System.out.println(number+" --> "+ frequency);

    }
}
