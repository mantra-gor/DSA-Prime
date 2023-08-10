package week2.arrays;

import java.util.Scanner;
public class BasicsOfArray {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

//        printing the array using for-each loop
        for (int y: marks) {
            System.out.println("Marks: "+ y);
        }

    }
}
