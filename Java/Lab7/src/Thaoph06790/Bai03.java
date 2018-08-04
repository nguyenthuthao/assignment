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
public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao email: ");
        String email= scanner.nextLine();
        if(!email.matches("\\w+@\\w+\\.\\w+")){
            System.out.println("Khong phai dinh dang email.");
        }
        System.out.print("Nhap vao so dien thoai: ");
        String soDienThoai= scanner.nextLine();
        if(!soDienThoai.matches("0243\\d{6}")){
            System.out.println("Khong phai dinh dang so dien thoai cua Ha Noi.");
        }
        System.out.print("Nhap so chung minh thu: ");
        String soCMT= scanner.nextLine();
        if(!soCMT.matches("\\d{9}")){
            System.out.println("Khong phai dinh dang so chung minh thu.");
        }
    }
}
