package week2.loopsPatterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
//        Pattern 1
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Pattern 2
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//       Pattern 3
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//      Pattern 4
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j <= 2*i-1; j++) {
                if (j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <= 2*i-1; j++) {
                if (j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}


/*

   *
  **
 ***
****

*/