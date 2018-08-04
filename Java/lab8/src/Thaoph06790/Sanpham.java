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
public class Sanpham {
    private String ten;
    private double gia;
    private double giamgia;
    private String thue;

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public String getThue() {
        return thue;
    }
    

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }
    
    public String xuat() {
        return "Sanpham{" + "ten=" + ten + ", gia=" + gia + ", giamgia=" + giamgia + '}';
    }
    
    void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao ten sp: ");
        this.setTen(scanner.nextLine());
        System.out.print("Nhap vao gia: ");
        this.setGia(scanner.nextDouble());
        System.out.print("Nhap vao gia giam: ");
        this.setGiamgia(scanner.nextDouble());
    }            

    public static void main(String[] args) {
        Sanpham sp1 = new Sanpham();
        sp1.nhap();
        System.out.println(sp1.xuat());
        
       Sanpham sp2 = new Sanpham();
       sp2.nhap();
        System.out.println(sp2.xuat());   
    }
    
}

