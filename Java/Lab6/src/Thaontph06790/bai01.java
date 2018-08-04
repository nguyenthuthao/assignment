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
public class bai01 {

    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thuc a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap vao so thuc b: ");
        b = scanner.nextDouble();
        b = 5 + 15 * Math.random();
        System.out.printf("So ngau nhien: %.0f\n", b);
        double min = Math.min(a, b);
        System.out.printf("So nho nhat trong 2 so: %.0f\n", a, b, min);
        double c = Math.pow(a, b);
        System.out.println("Phep toan : " + a + "^" + b + "=" + c);
        b = Math.round(b);
        System.out.printf("So duoc lam tron: %.0f\n", b);
    }
}
