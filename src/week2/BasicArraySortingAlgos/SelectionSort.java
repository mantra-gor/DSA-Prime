package week2.BasicArraySortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr = {44,53,23,38,20,18,12,8,5,2};
        int[] arr = {6,5,4,3,2,1};

        selectionSortAlgo(arr);

        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
    static void selectionSortAlgo(int[] arr){
        int len = arr.length;
        for (int i=0; i<len-1;i++){
            int min = i;
            for (int j=i+1; j<len; j++){
                if (arr[min] > arr[j])
                    min = j;
            }
            swap(arr,min,i);
        }
    }
    static void swap(int[] arr,int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
