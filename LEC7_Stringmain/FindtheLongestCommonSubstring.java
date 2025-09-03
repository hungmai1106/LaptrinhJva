package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class FindtheLongestCommonSubstring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter the first string: ");
        String str1 = s.nextLine();
        System.out.print("- Enter the second string: ");
        String str2 = s.nextLine();
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        String longestSubstring = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {

                String sub = str1.substring(i, j);

                if (str2.contains(sub)) {

                    if (sub.length() > longestSubstring.length()) {
                        longestSubstring = sub;
                    }
                }
            }
        }

        System.out.println("Chuỗi thứ nhất: \"" + str1 + "\"");
        System.out.println("Chuỗi thứ hai: \"" + str2 + "\"");
        System.out.println("Chuỗi con chung dài nhất: \"" + longestSubstring + "\"");
    }
}
