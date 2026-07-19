package Hash_set_and_map;

import java.util.HashSet;

public class remove_duplicates {
    static void main() {
        int[]arr = {1,1,1,2,2,3,3,3,4,4,4,5,5};
        HashSet<Integer> shivBala_set = new HashSet<>();

        for (int n : arr){
            shivBala_set.add(n);
        }
        System.out.println(shivBala_set);
    }
}
