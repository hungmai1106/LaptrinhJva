package Lec6;

import java.util.Scanner;

public class RemovingElementsfromanArrayListduringIteration {

    public static void main(String[] args) {
        int[] arr = {10, 60, 25, 80, 5, 95};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 50) {
                count++;
            }
        }

        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 50) {
                result[idx] = arr[i];
                idx++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
