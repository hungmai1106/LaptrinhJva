package opps;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class SinhVien extends Person {

    private String maSinhVien;
    private String renLuyen;

    @Override
    public void traTienDoXe() {
        //   throw new UnsupportedOperationException("Not supported yet."); 
        System.out.println("Sinh Vien: 2.000d/luot");
    }

    public SinhVien() {
    }

    public SinhVien(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd, String maSinhVien, String renLuyen) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }

    @Override

    public void nhap() {
        Scanner s = new Scanner(System.in);
        super.nhap();
        System.out.print("- Nhap ma sinh vien: ");
        maSinhVien = s.nextLine();
        danhGiaRenLuyen();
    }

    public void danhGiaRenLuyen() {
        Scanner s = new Scanner(System.in);
        System.out.println("===DANH GIA REN LUYEN===");
        System.out.print("- Nhap lua chon: ");
        int tl = s.nextInt();
        switch (tl) {
            case 1:
                renLuyen = "Gioi";
                break;
            case 2:
                renLuyen = "Kha";
                break;
            case 3:
                renLuyen = "Trung binh";
                break;
            case 4:
                renLuyen = "Yeu";
                break;
            default:
                System.out.println("Invalid");
        }
    }

    @Override

    public void hienthi(SimpleDateFormat sdf) {
        super.hienthi(sdf);
        System.out.println("-> Ma sinh vien: " + maSinhVien);
        System.out.println("-> Diem ren luyen: " + renLuyen);
        traTienDoXe();
    }
}
