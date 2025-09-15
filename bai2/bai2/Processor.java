package opps;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.UnsupportedOperationException;

public class Processor {

    public static void main(String[] args) {
        ListPerson listperson = new ListPerson();
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat();
        int tieptuc;
        do {
           
            System.out.println("===MENU===");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap thong tin ( Sinh Vien / Giao Vien )");
            System.out.println("2. Xuat danh sach");
            
            System.out.print("- Nhap lua chon menu: ");
            tieptuc = s.nextInt();
             s.nextLine();
            switch (tieptuc) {
                case 1:
                    System.out.println("Them mot nguoi vao danh sach");
                    System.out.println("Nhap ai (1)SinhVien (2)GiaoVien");
                    System.out.print("- Nhap lua chon: ");
                    int luaChonChucNang = s.nextInt();
                    if (luaChonChucNang == 1) {
                        SinhVien sv = new SinhVien();
                        listperson.themDanhSach(s, sdf, sv);
                    } else if (luaChonChucNang == 2) {
                        GiaoVien gv = new GiaoVien();
                        listperson.themDanhSach(s, sdf, gv);
                    } else {
                        System.out.println("Nhap sai");
                    }
                    break;
                case 2:
                    System.out.println("===DANH SACH TAT CA MOI NGUOI===");
                    listperson.xuatDanhSach(sdf);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (tieptuc != 0);
    }

    private static ListPerson themDanhSach(GiaoVien gv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
