
package Baitest;

import java.util.Scanner;

/**
 *
 * @author tvmin
 */
public class keyboard {
    public String readString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        return input;
    }
    public Double reaDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        Double input = scanner.nextDouble();
        return input;
    }
    
    public int readInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int input = scanner.nextInt();
        return input;
    }
}
