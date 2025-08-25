package LEC_5;

import java.util.Scanner;
import java.util.Random;

public class bt7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int n = r.nextInt(100) + 1;

        int g = 0;

        System.out.print("- Your guess: ");
        g = s.nextInt();

        while (g != n) {
            if (g > n) {
                System.out.println("Your number is higher than the secret number.");
            } else {
                System.out.println("Your number is lower than the secret number.");
            }

            // nhập lại số đoán
            System.out.print("- Your guess: ");
            g = s.nextInt();
        }

        System.out.println("Congratulations! You guessed correctly!");
    }
}
