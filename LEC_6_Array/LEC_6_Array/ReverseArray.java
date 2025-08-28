package Lec6;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter: ");
        int n = s.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ":");
            mang[i] = s.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = mang[i];
            mang[i] = mang[n - i - 1];
            mang[n - i - 1] = temp;
        }
        System.out.print("-> ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }

}
