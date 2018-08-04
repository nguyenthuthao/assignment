/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaontph06790;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author tvmin
 */
public class main {

    public static void main(String[] args) {
        QuanLySinhVien quanLy = new QuanLySinhVien();
        ArrayList<Sinhvien> listSinhVien = new ArrayList<>();
        keyboard k = new keyboard();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------main------main-------");
            System.out.println("Moi chon: ");
            System.out.println("1.Nhap vao danh sach sinh vien.");
            System.out.println("2.Xuat danh sach sinh vien.");
            System.out.println("3.Tim sinh vien theo hoc luc.");
            System.out.println("4.Sap xep.");
            System.out.println("5.Thoat.");
            System.out.print("Moi chon: ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    listSinhVien = quanLy.nhapDanhSach();
                    break;
                case 2:
                    quanLy.xuatDanhSach(listSinhVien);
                    break;
                case 3:
                    String hocLuc = k.readString("Nhap vao hoc luc: ");
                    ArrayList<Sinhvien> listHocLuc = quanLy.timHocLuc(hocLuc, listSinhVien);
                    quanLy.xuatDanhSach(listHocLuc);
                    break;
                case 4:
                    quanLy.sapXepHocVien(listSinhVien);
                    quanLy.xuatDanhSach(listSinhVien);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon khong dung moi chon lai!");
            }
        }
    }
}
