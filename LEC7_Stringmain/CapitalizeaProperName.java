package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class CapitalizeaProperName {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter the setence: ");
        String sen = s.nextLine();
        String[] sennew = sen.split(" ");
        System.out.print("-> ");
        for (int i = 0; i < sennew.length; i++) {
            System.out.print(sennew[i].substring(0, 1).toUpperCase() + sennew[i].substring(1).toLowerCase());
            if (i < sennew.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
