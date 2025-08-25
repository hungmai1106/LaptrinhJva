
package LEC_5;
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap h: ");
        int h=sc.nextInt();
        System.out.println("nhap w");
        int w=sc.nextInt();
        for(int i=0;i<h;i++){
            for(int j=1;j<w;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
