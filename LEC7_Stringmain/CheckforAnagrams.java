/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec7_String;

import java.util.AbstractCollection;
import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;

public class CheckforAnagrams {

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("- Enter the second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("-> The two strings are Anagrams.");
        } else {
            System.out.println("-> The two strings are not Anagrams.");
        }
    }
}
