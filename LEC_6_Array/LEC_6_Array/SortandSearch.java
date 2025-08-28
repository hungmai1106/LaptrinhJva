
package Lec6;

import java.util.Scanner;

import java.util.Arrays;

public class SortandSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter: ");
        int n = s.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number: ");
            mang[i] = s.nextInt();
        }
        Arrays.sort(mang);
        System.out.print("-> Sorted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println("");
        System.out.print("- Enter number: ");
        int x = s.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] == x) {
                System.out.println("The number " + x + " was found at index " + i);
            }
        }
    }
}
