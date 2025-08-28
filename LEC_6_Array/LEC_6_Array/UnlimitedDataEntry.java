/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6;

import java.util.Scanner;

public class UnlimitedDataEntry {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[1000];
        int count = 0, sum = 0;
        while (true) {
            int n = s.nextInt();
            if (n == -1) {
                break;
            }
            numbers[count] = n;
            sum += n;
            count++;
        }
        System.out.print("Numbers entered: [");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("The sum is: " + sum);
    }
}
