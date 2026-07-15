package sorting;

import java.util.Arrays;

public class Merge_sort {
//    static void main() {
//        int[]arr = {3,4,2,1,5,6};
//        Merge_sorting(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void Merge_sorting(int[]arr , int s , int e){
//
//        if(s<e) {
//
//            int mid = s+(e-s)/2;
//            Merge_sorting(arr,s,mid);
//            Merge_sorting(arr,mid+1,e);
//
//            merge(arr,s,mid,e);
//        }
//    }
//
//    static void merge(int[]arr, int s, int m , int e){
//
//        int[] temp = new int[e-s+1];
//
//        int i = s;
//        int j = m+1;
//        int k =0;
//
//        while ((i<=m) && (j<=e)){
//            if(arr[i]<= arr[j]){
//                temp[k]=arr[i];
//                i++;
//                k++;
//            }
//            else {
//                temp[k]=arr[j];
//                j++;
//                k++;
//            }
//        }
//
//        while (i<=m){
//            temp[k]=arr[i];
//            i++;
//            k++;
//        }
//        while (j<=e){
//            temp[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        for (int t = 0; t < temp.length; t++) {
//            arr[s+t]=temp[t];
//        }
//    }


    static void main() {
    int[]arr = {12,31,35,8,32,17};
    merge_sorting(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    }

    static void merge_sorting(int[]arr, int s, int e){
        if(s<e) {
            int mid = s + (e - s) / 2;
            // left side
            merge_sorting(arr, s, mid);
            //right side
            merge_sorting(arr, mid + 1, e);
            // merge part this is very imp
            merge_part(arr,s,mid,e);
        }
    }

    static void merge_part (int[]arr , int s ,int mid , int e){

        int[] temp = new int[e-s+1];

        int i= s;
        int j = mid+1;
        int k = 0;

        while ((i<= mid) && (j<=e)){

            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else {
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=e){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for (int t = 0; t < temp.length; t++) {
            arr[s+t]=temp[t];     // this is imp becoz right part have start index from mid+1 so we cant directly take arr[0]= temp[0]
                                   // suppose my strat is 4 so (4+0 4+1 4+2) they will make changess in their right part
                                 // right side will sort their right  part and left will left part
        }

    }

}
