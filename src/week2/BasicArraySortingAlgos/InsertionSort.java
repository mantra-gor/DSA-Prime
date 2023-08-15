package week2.BasicArraySortingAlgos;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {22,45,12,55,23,9,0,5,1};

        insertionSortAlgo(arr);

//        Printing the Array
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    static void insertionSortAlgo(int[] a){
        int len = a.length;
        for (int i=1; i<len; i++){
            int temp = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }
}
