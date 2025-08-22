
package LEC_5;
import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu cao cua tam giac: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == h || k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
