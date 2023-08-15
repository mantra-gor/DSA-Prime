package week2.BasicArraySortingAlgos;

public class BasicArrayProblems {
    public static void main(String[] args) {
        //Index      0 1 2 3 4 5
//        int[] arr = {3,5,7,9,11,14,6};
        int[] arr = {2,5,6,8,9,4};

        lastNumberInSortedPosition(arr);

//        Printing the array
        System.out.print("Sorted Array: ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
    static void lastNumberInSortedPosition(int[] a){
        int len = a.length; //len = 6
        int lastNumber = a[len-1];
        int swapIndex = len-2; //swapIndex = 4 3 2 1 0


        while (swapIndex >= 0 && a[swapIndex] >= lastNumber){
            swapIndex--;
        }

        for (int i = len-1; i >= swapIndex+2; i--){
            a[i] = a[i-1];
        }
//         Final Swapping
        int temp = lastNumber;
        lastNumber = a[swapIndex+1];
        a[swapIndex+1] = temp;

    }
}
