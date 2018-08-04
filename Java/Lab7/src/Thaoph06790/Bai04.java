/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thaoph06790;

import java.util.Scanner;

/**
 *
 * @author tvmin
 */
public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        String hoTen=scanner.nextLine();
        if(hoTen.matches("\\w{15}+")){
            System.out.println("Nhap sai.Moi nhap lai: ");
        }
        System.out.print("Nhap vao lop: ");
        String lop=scanner.nextLine();
        if(lop.matches("\\w{3}+\\d{5}+")){
            System.out.println("Nhap sai.Moi nhap lai: ");
        }
        System.out.print("Nhap vao so dien thoai: ");
        String soDienThoai=scanner.nextLine();
        if(soDienThoai.matches("\\d{9,10}+")){
            System.out.println("Nhap sai.Moi nhap lai: ");
        }
        System.out.print("Nhap vao ngay sinh: ");
        String ngaySinh=scanner.nextLine();
        if(ngaySinh.matches("\\d{3}+\\-+\\d{3}+\\-+\\d{5}+")){
            System.out.println("Nhap sai.Moi nhap lai: ");
        }
        System.out.print("Nhap vao que quan: ");
        String queQuan=scanner.nextLine();
        if(queQuan.matches("\\w{10}+")){
            System.out.println("Nhap sai.Moi nhap lai: ");
        }
    }
}
