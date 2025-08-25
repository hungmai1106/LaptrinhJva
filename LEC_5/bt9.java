package LEC_5;

import java.util.Scanner;

public class bt9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        System.out.print("Enter a number (enter 0 to stop): ");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            count++;

            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

    }
}
