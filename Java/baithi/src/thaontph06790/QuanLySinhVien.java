/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaontph06790;

/**
 *
 * @author tvmin
 */
import java.util.ArrayList;

public class QuanLySinhVien {

    ArrayList<Sinhvien> nhapDanhSach() {
        keyboard k = new keyboard();
        ArrayList<Sinhvien> sv = new ArrayList<>();
        int n = k.reaInt("Nhap vao so sinh vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu: " + (i + 1) + "---");
            Sinhvien sinhvien = new Sinhvien();
            sinhvien.hoTen = k.readString("Nhap vao ho ten: ");
            sinhvien.maSo = k.readString("Nhap vao ma so: ");
            sinhvien.diem = k.reaDouble("Nhap vao diem: ");
            sv.add(sinhvien);
        }
        return sv;
    }

    void xuatDanhSach(ArrayList<Sinhvien> sinhviens) {
        System.out.println("Danh sach sinh vien vua nhap.");
        System.out.printf("%-10s %-20s %-10s %-10s\n", "Ho ten", "Ma sv", "Diem", "Hoc luc");
        for (int i = 0; i < sinhviens.size(); i++) {
            Sinhvien sv = sinhviens.get(i);
            System.out.printf("%-10s %-20s %-10.1f %-10s\n", sv.hoTen, sv.maSo, sv.diem, sv.hocLuc());
        }
    }

    ArrayList<Sinhvien> timHocLuc(String hocLuc, ArrayList<Sinhvien> listSinhVien) {
        ArrayList<Sinhvien> listSinhVienTam = new ArrayList<>();
        for (int i = 0; i < listSinhVien.size(); i++) {
            Sinhvien sv = listSinhVien.get(i);
            if (sv.hocLuc().equals(hocLuc)) {
                listSinhVienTam.add(sv);
            }
        }
        return listSinhVienTam;
    }
    
        void sapXepHocVien(ArrayList<Sinhvien> listSinhVien) {

        boolean doi = true;
        int j = 0;
        Sinhvien temp;
        while (doi) {
            doi = false;
            j++;
            for (int i = 0; i < listSinhVien.size() - j; i++) {
                if (listSinhVien.get(i).diem > listSinhVien.get(i + 1).diem) {
                    temp = listSinhVien.get(i);
                    listSinhVien.set(i, listSinhVien.get(i + 1));
                    listSinhVien.set(i + 1, temp);
                    doi = false;
                }
            }
        }
    }
}
