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
public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String Fullname=scanner.nextLine();
        int d= Fullname.length();
        int m=Fullname.indexOf(" ");
        int n=Fullname.lastIndexOf(" ");
        String ho=Fullname.substring(0, m);
        String dem=Fullname.substring(m, n);
        String ten=Fullname.substring(n, d);
        System.out.println("Họ: "+ho);
        System.out.println("Đệm: "+dem);
        System.out.println("Tên: "+ten);
    }
}
