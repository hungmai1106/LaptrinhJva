/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class FindtheLongestWordinaSentence {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String[] words = s.split(" ");
        String max = words[0];
        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > max.length()) {
                max = words[i];
            }

        }
        System.out.println("-> Max: " + max);

    }
}
