package Baitest;

import java.util.ArrayList;

/**
 *
 * @author tvmin
 */
public class QuanLyEmployee {

    ArrayList<Employee> nhapDachSachnhanvien() {
        keyboard k = new keyboard();
        ArrayList<Employee> lem = new ArrayList<>();
        int n = k.readInt("Nhap so phan tu:");
        for (int i = 0; i < n; i++) {
            Employee nhanvien = new Employee();
            System.out.println("-----Nhan vien thu " + (i + 1) + "-----");
            nhanvien.ten = k.readString("Nhap vao ten nhan vien: ");
            nhanvien.manv = k.readString("Nhap ma nhan vien: ");
            nhanvien.luong = k.reaDouble("Nhap vao luong: ");
            lem.add(nhanvien);
        }
        return lem;
    }
      void xuatDanhSachNhanVien(ArrayList<Employee> nhanviens) {
        System.out.println("-----Danh sach nhan vien vua nhap:-----");
        System.out.printf("%-10s %-20s %-20s %-10s\n", "Manv", "Ten nhan vien", "Luong","Thue");
        for (int i = 0; i < nhanviens.size(); i++) {
            Employee nv = nhanviens.get(i);
            System.out.printf("%-10s %-20s %-20s %-10s\n", nv.manv,nv.ten,nv.luong,nv.thue());
        }
    }
       ArrayList<Employee> timnhanvien(double min, double max, ArrayList<Employee> nvs) {
        ArrayList<Employee> listNhanVien = new ArrayList<>();
        for (int i = 0; i < nvs.size(); i++) {
            double luongNhanVien = nvs.get(i).luong;
            if (luongNhanVien > min && luongNhanVien < max) {
                listNhanVien.add(nvs.get(i));
            }
        }
        return listNhanVien;
    }
         void sapXepHocVien(ArrayList<Employee> listNhanVien) {

        boolean doi = true;
        int j = 0;
        Employee temp;
        while (doi) {
            doi = false;
            j++;
            for (int i = 0; i < listNhanVien.size() - j; i++) {
                if (listNhanVien.get(i).luong > listNhanVien.get(i + 1).luong) {
                    temp = listNhanVien.get(i);
                    listNhanVien.set(i, listNhanVien.get(i + 1));
                    listNhanVien.set(i + 1, temp);
                    doi = false;
                }
            }
        }
    }
}
