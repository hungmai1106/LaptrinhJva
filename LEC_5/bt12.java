
package LEC_5;
import java.util.Scanner;

public class bt12 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("nhap n: ");
        int n=sr.nextInt();
        boolean LaNguyenTo=true;
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                LaNguyenTo=false;
            }
        }
        if(LaNguyenTo){
            System.out.println(n +"la so nguyen to");
        }else{
            System.out.println(n +"khong phai la so nguyen to");
        }
        sr.close();
    }
}
