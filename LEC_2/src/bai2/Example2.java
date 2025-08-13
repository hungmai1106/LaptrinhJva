
    
package bai2;

import java.awt.BorderLayout;

public class Example2 {
    public static void main(String[] args) {
        int x = 1;
        int y = x + ++x - x-- - x++ + x - x--;
        System.out.println("y= " + y);
        
    }
}

