package Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheSecondLargestElement {

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
        System.out.println("-> The second-largest element is: " + mang[n - 2]);

    }
}
