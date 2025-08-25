
package LEC_5;
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap h: ");
        int h=sc.nextInt();
        for(int i=1;i<=h;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println("");
        }
    }
}
