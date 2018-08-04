/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thaontph06790;

import java.util.ArrayList;

/**
 *
 * @author tvmin
 */
public class bai03 {

    public static void main(String[] args) {
        String fullName = "";
        int tuoi = 0;
        boolean gioiTinh = true;
        double diem = 0;
        keyboard1 k = new keyboard1();
        int n = k.readInt("Nhap so phan tu: ");
        for (int i = 0; i < n; i++) {
            fullName = k.readString("Ho ten: ");
            tuoi = k.readInt("Tuoi: ");
            gioiTinh = k.readBoolean("Gioi tinh: ");
            diem = k.reaDouble("Diem: ");
        }
        System.out.println("Xuat danh sach sinh vien: ");
        System.out.printf("%-10s %-20s %-10s %-10s\n", "Ho ten", "Tuoi", "Gioi tinh", "Diem");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-20s %-10s %-10s\n", fullName, tuoi, gioiTinh, diem);
        }
    }
}