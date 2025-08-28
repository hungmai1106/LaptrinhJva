package Lec6;

import java.util.Scanner;
import java.util.ArrayList;

public class ConvertBetweenArrayandArrayList {

    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list1 = arrayToArrayList(arr);
        System.out.println("Array -> ArrayList: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Charles");
        list2.add("David");
        String[] arr2 = arrayListToArray(list2);

        System.out.print("ArrayList -> Array: [");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
