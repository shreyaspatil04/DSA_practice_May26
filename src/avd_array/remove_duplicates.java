package avd_array;

// linked hash......

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_duplicates {
    static void main() {
        int[] arr = {1,4,3,2,1,2,2,3,4,5,6,5,4,2,4,2,3,32,3,2,3,3,14,5,5,6,7,8,9,7,32,33};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] ans = new int[set.size()];

        int i =0;

        for(var val : set){
            ans[i]= val;
            i++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
