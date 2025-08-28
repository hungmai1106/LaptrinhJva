package Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 6};
        int[] a2 = {2, 3, 5};

        int[] merged = merge(a1, a2);
        System.out.print("[");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i < merged.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
