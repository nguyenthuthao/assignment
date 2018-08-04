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
public class Bai02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao uesname: ");
        String usename = scanner.nextLine();
        System.out.print("Nhap vao password: ");
        String password = scanner.nextLine();
        if (usename.equals("FPT")&&password.equalsIgnoreCase("polytechnic")) {
            System.out.println("Dang nhap thanh cong.");
        }else{
            System.out.println("Sai usename.");
            System.out.println("Sai password.");
        }
    }
}
