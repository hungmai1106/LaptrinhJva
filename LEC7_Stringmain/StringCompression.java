package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == currentChar) {
                count++; // 
            } else {

                sb.append(currentChar);
                sb.append(count);
                currentChar = c;
                count = 1;
            }
        }
        sb.append(currentChar);
        sb.append(count);

        System.out.println("-> " + sb.toString());
    }
}
