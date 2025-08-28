package Lec6;

import java.util.Scanner;

public class CharacterFrequencyArra {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("- Enter the string: ");
        String str = s.nextLine();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + freq[i]);
            }
        }
    }
}
