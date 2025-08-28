
package Lec6;
import java.util.Scanner;
public class FindMaxAndMin {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("- Enter integer: ");
        int n = s.nextInt();
        int [] mang = new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.print("Number " + (i+1) + ":");
            mang[i]=s.nextInt();
        }
        int max = mang[0];
        for (int i=0;i<n;i++)
        {
            if (mang[i]>max) max=mang[i];
        }
        int min=mang[0];
        for (int i=0;i<n;i++)
        {
            if (mang[i]<min) min=mang[i];
        }
        System.out.println("-> Max: " + max);
        System.out.println("-> Min: " + min);
    }
 
}
