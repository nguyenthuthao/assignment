/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thao;

/**
 *
 * @author tvmin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        QuanLyStudent quanly = new QuanLyStudent();
        keyboard k = new keyboard();
        ArrayList<Student> listHocVien = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------Menu-------Menu---------");
            System.out.println("Moi chon: ");
            System.out.println("1.Nhap vao ma sinh vien");
            System.out.println("2.Xuat ra danh sach sinh vien");
            System.out.println("3.Tim kiem hoc vien theo xep loai");
            System.out.println("4.Sap xep giam dan");
            System.out.println("5.Thoat");
            System.out.print("Moi chon: ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    listHocVien = quanly.nhapDanhSachHocSinh();
                    break;
                case 2:
                    quanly.xuatDanhSachHocVien(listHocVien);
                    break;
                case 3:
                    String xepLoai = k.readString("Nhap vao xep loai: ");
                    ArrayList<Student>listXepLoai = quanly.timHocLuc(xepLoai, listHocVien);
                    quanly.xuatDanhSachHocVien(listXepLoai);
                    break;
                case 4:
                    quanly.sapXepHocVien(listHocVien);
                    quanly.xuatDanhSachHocVien(listHocVien);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Chon khong dung moi chon lai.");
            }
        }
    }
}
