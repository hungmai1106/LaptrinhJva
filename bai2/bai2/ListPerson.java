package opps;

import java.util.*;
import java.text.SimpleDateFormat;

public class ListPerson {

    ArrayList<Person> danhSachNguoi = new ArrayList<>();

    public void themDanhSach(Scanner s, SimpleDateFormat sdf, Person person) {
        person.nhap();
        danhSachNguoi.add(person);
        System.out.println("Them thanh cong");
    }

    public void xuatDanhSach(SimpleDateFormat sdf) {
        if (danhSachNguoi.size() == 0) {
            System.out.println("Danh sach rong");
        } else {
            for (int i = 0; i < danhSachNguoi.size(); i++) {
                danhSachNguoi.get(i).hienthi();
            }
        }
    }

    void xuatDanhsach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void xuatDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
