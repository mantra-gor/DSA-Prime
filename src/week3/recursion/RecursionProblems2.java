package week3.recursion;

public class RecursionProblems2 {
    public static void main(String[] args) {
        String str = "hello world, hello universe";
        String target = "hello";
//        System.out.println(countOccurrences(str, target));

        String str1 = "abc";
//        printAllSubsets(str1);

//        int[] arr = {1,2,3,4,5};
        int[] arr = {10,20,40,30};
        System.out.println(arraySortedOrNot(arr, 4));
    }
    static int countOccurrences(String s, String t){
        return countOccurrencesHelper(s, t, 0);
    }
    static int countOccurrencesHelper(String s, String t, int i){
        if (i > s.length() - t.length()){
            return 0;
        }

        int count = countOccurrencesHelper(s, t, i+1);

        if (s.substring(i, i + t.length() ).equals(t)) return ++count;
        else return count;
    }

//    Example : Print all sub string of a given String
    static void printAllSubsets(String s){
        printAllSubsets(s, 0, "");
    }
    static void printAllSubsets(String s, int i, String cur){
//        base case
        if (i == s.length()){
            System.out.println(cur);
            return;
        }
        printAllSubsets(s, i+1, cur + s.charAt(i));
        printAllSubsets(s, i+1, cur);
    }

    public static boolean arraySortedOrNot(int []arr, int n){
        //You can code here
        int start = 0;
        int end = n-1;
        return arraySortedOrNot(arr, n, start, end);
    }

    static boolean arraySortedOrNot(int []arr, int n, int start, int end){
        if( start >= end ){
            return true;
        }
        if(arr[start] <= arr[end]){
            return arraySortedOrNot(arr, n, start+1, end);
        }
        return false;
    }
}
