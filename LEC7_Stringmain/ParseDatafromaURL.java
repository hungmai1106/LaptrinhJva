package Lec7_String;

import java.lang.String;
import java.util.Scanner;

public class ParseDatafromaURL {

    public static void main(String[] args) {
        String s = "https://dtu.edu.vn/portals/0/home.aspx";

        int indexDauHaiCham = s.indexOf(':');
        String protocol = s.substring(0, indexDauHaiCham);
        System.out.println("Protocol: " + protocol);

        int indexBatDauTenMien = s.indexOf("//") + 2;
        int indexKetThucTenMien = s.indexOf('/', indexBatDauTenMien);
        String domain = s.substring(indexBatDauTenMien, indexKetThucTenMien);
        System.out.println("Domain: " + domain);

        String path = s.substring(indexKetThucTenMien);
        System.out.println("Path: " + path);
    }
}
