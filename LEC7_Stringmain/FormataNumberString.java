package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class FormataNumberString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Enter a number: ");
        String number = sc.nextLine();

        StringBuilder sb = new StringBuilder(number);

        int count = 0;

        for (int i = sb.length() - 1; i > 0; i--) {
            count++;
            if (count == 3) {
                sb.insert(i, ",");
                count = 0;
            }
        }

        System.out.println("-> " + sb.toString());
    }
}
