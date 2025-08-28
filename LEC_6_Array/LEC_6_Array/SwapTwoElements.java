package Lec6;

import java.util.Scanner;

public class SwapTwoElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter: ");
        int n = s.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Number: ");
            mang[i] = s.nextInt();
        }
        System.out.print("- Enter index want swap: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int temp = mang[y];
        mang[y] = mang[x];
        mang[x] = temp;
        System.out.print("-> Swaped: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}
