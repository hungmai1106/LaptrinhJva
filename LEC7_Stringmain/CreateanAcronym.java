package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class CreateanAcronym {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Enter the sentence: ");
        String sen = s.nextLine();
        String[] sennew = sen.split(" ");
        System.out.print("-> ");
        for (int i = 0; i < sennew.length; i++) {
            System.out.print(sennew[i].charAt(0));
        }
        System.out.println("");
    }
}
