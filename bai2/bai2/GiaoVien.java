package opps;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class GiaoVien extends Person {

    private String maGiaoVien;
    private String xepLoaiThiDua;

    @Override
    public void traTienDoXe() {
        System.out.println("Giao vien mien phi");
    }

    public GiaoVien() {
    }

    public GiaoVien(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd, String maGiaoVien, String xepLoaiThiDua) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maGiaoVien = maGiaoVien;
        this.xepLoaiThiDua = this.xepLoaiThiDua;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public String getXepLoaiThiDua() {
        return xepLoaiThiDua;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public void setXepLoaiThiDua(String xepLoaiThiDua) {
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    @Override
    public void nhap() {
        Scanner s = new Scanner(System.in);
        super.nhap();
        System.out.print("- Nhap ma giao vien: ");
        maGiaoVien = s.nextLine();
        xepLoaiThiDua();
    }

    public void xepLoaiThiDua() {
        Scanner s = new Scanner(System.in);
        System.out.println("===XEP LOAI THI DUA");
        System.out.print("- Nhap lua chon: ");
        int tl = s.nextInt();
        switch (tl) {
            case 1:
                xepLoaiThiDua = "A";
                break;
            case 2:
                xepLoaiThiDua = "B";
                break;
            case 3:
                xepLoaiThiDua = "C";
                break;
            case 4:
                xepLoaiThiDua = "D";
                break;
            default:
                System.out.println("Invalid");
        }
    }

    @Override
    public void hienthi(SimpleDateFormat sdf) {
        super.hienthi(sdf);
        System.out.println("-> Ma giao vien: " + maGiaoVien);
        System.out.println("-> Xep loai thi dua: " + xepLoaiThiDua);
        traTienDoXe();
    }
}
