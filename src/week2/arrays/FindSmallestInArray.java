package week2.arrays;

public class FindSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {23,55,12,16,5,2,16};
        int min = Integer.MAX_VALUE;
        for (int x: arr) {
            if (min > x){
                min = x;
            }
        }
        System.out.println("Minimum no. is: " + min);
    }
}
