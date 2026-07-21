package Hash_set_and_map;


import java.util.Arrays;
import java.util.HashMap;

// here we have to find two elements from array to
public class Two_sum {
    static void main() {
        int[]arr = {2,6,4,1,7,11};
        int sum = 9;
        System.out.println(Arrays.toString(two_sum(arr,sum)));
    }


  static int[] two_sum(int[]arr, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
        int diff = sum - arr[i];

        if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};
        }else {
            map.put(arr[i],i);
        }
    }
    return new int[]{-1,-1};
  }
}

// brute force approach................
//     Brute Force Approach
//        Check every pair.
//
//        for(i=0;i<n;i++)
//        for(j=i+1;j<n;j++)
//        if(nums[i]+nums[j]==target)
//        return {i,j};
//
//
//        Time Complexity
//        O(n²)

/*
        explain this pls in very easy words


        ChatGPT said:
        Sure! Think of this problem like this:

        Problem
        You have a list of numbers:

        nums = {2, 7, 11, 15}


        And a target:

        target = 9


        You need to find two numbers that add up to 9.

        Here:

        2 + 7 = 9
        Their indexes are:

        2 is at index 0
        7 is at index 1
        So the answer is:

        [0, 1]


        Step 1: Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();


        A HashMap stores:

        Number -> Index


        Example:

        2 -> 0
        7 -> 1
        11 -> 2


        This lets us quickly check whether a number has already appeared.

        Step 2: Loop through the array
for (int i = 0; i < nums.length; i++)


        This goes through every number one by one.

        First iteration
        i = 0
        nums[i] = 2


        Find what number is needed to make 9.

        int diff = target - nums[i];


        So,

        diff = 9 - 2
        = 7


        Ask:

        "Have I already seen 7?"

        map.containsKey(7)


        Map is empty.

        {}


        Answer:

        No


        So store 2.

        map.put(2,0);


        Now map is:

        2 -> 0


        Second iteration
        i = 1
        nums[i] = 7


        Calculate:

        diff = 9 - 7
        = 2


        Ask:

        "Have I already seen 2?"

        Current map:

        2 -> 0


        Yes!

        So return

        return new int[]{map.get(2),1};


        map.get(2) gives

0


        Answer:

        {0,1}


        Program stops.

        What if the array was bigger?
        Example:

        nums = {3,2,4}
        target = 6


        First number
3
        Need 3


        Map:

        3 -> 0


        Second number
2
        Need 4


        Map doesn't have 4.

        Store:

        3 -> 0
        2 -> 1


        Third number
4
        Need 2


        Map has:

        2 -> 1


        Return:

        [1,2]


        Because

        nums[1] = 2
        nums[2] = 4

        2 + 4 = 6


        Why do we calculate diff?
        Suppose target is 20.

        Current number is 8.

        Ask yourself:

        "What number do I need with 8 to make 20?"

        20 - 8 = 12


        So you simply check:

        Have I already seen 12?


        If yes, you're done.

        Why use a HashMap?
        Without a HashMap, you'd compare every number with every other number.

        Example:

        2 with 7
        2 with 11
        2 with 15
        7 with 11
        7 with 15
        ...


        This takes much longer.

        A HashMap lets you find a number almost instantly.

        Dry Run of Your Example
        i	nums[i]	diff = target - nums[i]	Map before	Found?	Map after
0	2	7	{}	❌	{2→0}
        1	7	2	{2→0}	✅	Return [0,1]


*/