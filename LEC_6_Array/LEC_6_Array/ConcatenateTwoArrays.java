package Lec6;

import java.util.Scanner;

public class ConcatenateTwoArrays {

    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        int[] newArray = concatenate(a1, a2);

        System.out.print("New array [");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
