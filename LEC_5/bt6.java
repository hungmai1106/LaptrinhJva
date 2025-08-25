
package LEC_5;
import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        int m=1;
        for(int i=n;i>=1;i--){
            m*=i;
        }
        System.out.println("giai thua cua "+n +"la "+m);
    }
}
