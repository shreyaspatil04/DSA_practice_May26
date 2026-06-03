package avd_array;

import java.util.HashSet;

public class count_distinct_element {
    static void main() {
        int[]arr = {1,2,4,5,3,2,3,1,4,5,6};

        HashSet<Integer> set = new HashSet<>();

        for (int val : arr){
            set.add(val);
        }

        System.out.println(set.size());
    }
}
