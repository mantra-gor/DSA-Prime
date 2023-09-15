package week3.recursion;

public class LearnRecursionBasics {
    public static void main(String[] args) {
//        func1(5);
//        func2(5);
//        func3(3);
//        System.out.println(sumOf(10));

//        ::fibonacci series:: 0,1,1,2,3,5,8,13,21...
        System.out.println(fibo(7));
    }

//    Linear Recursion
    static void func1(int n){
        if (n > 0){
            System.out.println(n);
            func1(n-1);
        }
    }
    static void func2(int n){
        if (n > 0){
            func2(n -1);
            System.out.println(n);
        }
    }

//    Tree Recursion
    static void func3(int n){
        if (n > 0){
            System.out.println(n);
            func3(n-1);
            func3(n-1);
        }
    }

//    Example: Find The Sum of n natural number
    static int sumOf(int n){
        if (n == 1) return 1;
        else return sumOf(n-1) + n;
    }

//    Example: Find The N-th Fibonacci Number
    static int fibo(int n){
        if (n == 0 || n == 1) return n;
        else return fibo(n-1) + fibo(n-2);
    }
}
