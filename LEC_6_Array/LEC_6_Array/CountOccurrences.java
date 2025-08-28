package Lec6;

import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter: ");
        int n = s.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1)  + ": ");
            mang[i] = s.nextInt();
        }
        int count = 0;
        System.out.print("- Enter X: ");
        int x = s.nextInt();
        for (int i = 0; i < n; i++) {
            if (mang[i] == x) {
                count++;
            }
        }
        System.out.println("-> Number " + x + " appears " + count + "   times"
    

);
    }
}
