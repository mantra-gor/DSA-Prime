package week4.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int l = 0 ,r = arr.length-1;
        List<int[]> array = new ArrayList<>();
        findPermutations(arr, l, r, array);
        for (int[] a : array){
            printArray(a);
        }
    }

    static void findPermutations(int[] arr, int l, int r, List<int[]> array) {
        if (l == r){
//            printArray(arr);
            array.add(arr.clone());
            return;
        }
        for (int i=l; i<=r; i++){
            swap(arr, i, l);
            findPermutations(arr, l+1, r, array);
            swap(arr, i, l);
        }
    }

    static void swap(int[] arr, int i, int l) {
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
    }

    static void printArray(int[] arr) {
        for (int ele : arr){
            System.out.print(ele);
        }
        System.out.println();
    }
}
