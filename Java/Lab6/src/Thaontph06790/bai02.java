/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thaontph06790;

import java.util.Scanner;

/**
 *
 * @author tvmin
 */
public class bai02 {
    
    static String xeploai(double diem) {
        String xepLoai = "";
        System.out.print("Nhap vao diem: ");
        if (diem < 5) {
            xepLoai = "Yeu";
        } else if (diem < 6.5) {
            xepLoai = "Trung Binh";
        } else if (diem < 7.5) {
            xepLoai = "Kha";
        } else if (diem < 9) {
            xepLoai = "Gioi";
        } else {
            xepLoai = "Xuat Sac";
        }
        return xepLoai;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao diem: ");
        double diem=scanner.nextDouble();
        String hocLuc=xeploai(diem);
        System.out.println(hocLuc);
    }
}

