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
public class keyboard1 {
    public String readString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        return input;
    }
    public Double reaDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        Double input = Double.parseDouble(scanner.nextLine());
        return input;
    }
    
    public int readInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }
    public boolean readBoolean (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        boolean input = Boolean.parseBoolean(scanner.nextLine());
        return input;
    }
}
