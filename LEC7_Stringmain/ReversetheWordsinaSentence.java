package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class ReversetheWordsinaSentence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter the sentence: ");
        String sen = s.nextLine();
        String[] sennew = sen.split(" ");
        System.out.print("-> ");
        for (int i = sennew.length - 1; i >= 0; i--) {
            System.out.print(sennew[i] + " ");
        }
    }
}
