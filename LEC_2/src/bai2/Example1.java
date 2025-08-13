
package bai2;

import java.awt.BorderLayout;

public class Example1 {
    public static void main(String[] args) {
        int x = 1;
        int z=x - x-- - x++ + --x - x + x-- + x;
        System.out.println("z= " + z);
    }
}
