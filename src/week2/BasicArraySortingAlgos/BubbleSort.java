package week2.BasicArraySortingAlgos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {22,45,12,55,23,9,0,5,1};
        bubbleSortAlgo(arr);
//        swap(arr,0 ,1);
        printArray(arr);
    }
    static void bubbleSortAlgo(int[] a){
        int len = a.length;
        for (int i=0; i<len-1; i++){
            boolean check = false;
            for (int j=0; j<len-i-1; j++){
                if (a[j]>a[j+1]){
                    check = true;
                    swap(a,j,j+1);
                }
            }
            if (!check)
                break;
//            System.out.println("Pass "+i+" Completed");
        }
    }

    static void swap(int[] arr,int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

//    Print Sorted Array
    static void printArray(int[] a){
        for (int ele : a){
            System.out.print(ele + " ");
        }
    }
}
