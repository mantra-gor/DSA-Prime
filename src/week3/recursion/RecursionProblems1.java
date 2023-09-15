package week3.recursion;

public class RecursionProblems1 {
    public static void main(String[] args) {
//        Call for nCr
//        System.out.println("nCr: " + nCr(5,3));

//        Call for Josephus Problem
        System.out.println("The Safe Position is: " + josephusProblem(3,2));

//        Call for Factorial
//        System.out.println("Factorial is: " + factorial(5));
    }
//    Example: Find The nCr of given number
    static int nCr(int n, int r){
        if (n<r) return 0;
        if (n == r || r == 0) return 1;
        else return nCr(n-1,r-1) + nCr(n-1, r);
    }
//    Example: Josephus Problem
    static int josephusProblem(int n,int k){
        if (n == 0) return 1;
        int ans = ((josephusProblem(n-1,k) + k-1) % n) + 1;
        System.out.println(ans);
        return ans;
    }
//    Example: Find Factorial
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
