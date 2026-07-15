package sorting;

import java.util.Arrays;

public class quick_sort {
    static void main() {
//        int[] arr = {5,2,6,4,1,3};
        int[]arr = {5,4,3,5};
        Quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void Quick_sort(int[] arr, int s ,int e){
        if(s<e) {
            int pivot_Index = partition(arr, s, e);
            Quick_sort(arr, s, pivot_Index - 1);
            Quick_sort(arr, pivot_Index + 1, e);
        }
    }

    static int partition(int[]arr, int s , int e){

        int pivot = arr[e];
        int index = s-1;

        for (int j = s; j < e; j++) {
            if(arr[j]<pivot){   // here < and <= gives the same ans
                index++;
                swap(arr,j,index);
            }
        }
        index++;
        swap(arr,index,e);
        return index;
    }

    static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }

}
