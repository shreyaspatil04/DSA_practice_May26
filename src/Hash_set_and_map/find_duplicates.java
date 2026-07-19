package Hash_set_and_map;

import java.util.HashSet;

public class find_duplicates {
    static void main() {
        int[]arr = {12,14,13,16,17,12,19,13};

        HashSet<Integer> set = new HashSet<>();

        for(int n :  arr){

            if(set.contains(n)){
                System.out.println(n);
            }
            else {
                set.add(n);
            }
        }
    }
}
