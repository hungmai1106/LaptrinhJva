package Lec6;

import java.util.Scanner;

public class FilterEvenNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter: ");
        int n = s.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            mang[i] = s.nextInt();
        }
        System.out.print("-> Even: ");
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print( mang[i] + " ");
            }
        }
    }
}
