package Lec6;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicateElements {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            boolean found = false;
            for (int j = 0; j < result.size(); j++) {
                if (current == result.get(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(current);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        System.out.println("Input: " + numbers);
        ArrayList<Integer> noDup = removeDuplicates(numbers);
        System.out.println("Output: " + noDup);
    }
}
