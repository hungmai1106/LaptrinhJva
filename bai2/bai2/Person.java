package opps;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public abstract class Person {

    private String hoVaTen;
    private Date ngaySinh;
    private String gioiTinh;
    private int cmnd;

    public Person() {
    }

    public Person(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("- Nhap ho va ten: ");
        hoVaTen = s.nextLine();
        System.out.print("- Nhap ngay sinh: ");
        String date = s.nextLine();
        try {
            ngaySinh = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid");
            ngaySinh = null;
        }
        System.out.print("- Nhap gioi tinh: ");
        gioiTinh = s.nextLine();
        System.out.print("- Nhap CMND: ");
        cmnd = s.nextInt();

    }

    public void hienthi() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("-> Ten: " + hoVaTen);
        System.out.println("-> Ngay sinh: " + sdf.format(ngaySinh));
        System.out.println("-> Gioi tinh: " + gioiTinh);
        System.out.println("-> CMND: " + cmnd);
    }

    public void capnNhatBangcmnd(int cmnd) {

    }

    public abstract void traTienDoXe();

    void hienthi(SimpleDateFormat sdf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
