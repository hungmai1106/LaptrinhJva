package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class CountWordsinaString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter the sentence: ");
        String sen = s.nextLine();
        String[] sennew = sen.split(" ");
        int count = 0;
        for (int i = 0; i < sennew.length; i++) {
            count++;
        }
        System.out.println("-> Count: " + count);
    }
}
