/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tvmin
 */
public class program {

    public static void main(String[] args) {
        QuanLyEmployee quanly = new QuanLyEmployee();
        ArrayList<Employee> listNhanVien = new ArrayList<>();
        keyboard k = new keyboard();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Moi chon: ");
            System.out.println("1.Nhap danh sach nhan vien");
            System.out.println("2.Xuat danh sach nhan vien");
            System.out.println("3.Tim kiem nhan vien theo khoang luong");
            System.out.println("4.Sap xep");
            System.out.println("5.Thoat.");
            System.out.print("Moi chon: ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    listNhanVien=quanly.nhapDachSachnhanvien();
                    break;
                case 2:
                    quanly.xuatDanhSachNhanVien(listNhanVien);
                    break;
                case 3:
                    double min = k.reaDouble("Nhap so Min: ");
                    double max = k.reaDouble("Nhap so Max: ");
                    ArrayList<Employee> listKhoangLuong = quanly.timnhanvien(min, max, listNhanVien);
                    quanly.xuatDanhSachNhanVien(listKhoangLuong);
                    break;
                case 4:
                    quanly.sapXepHocVien(listNhanVien);
                    quanly.xuatDanhSachNhanVien(listNhanVien);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Chon khong dung moi chon lai.");
            }
        }
    }
}
