
package Baitest;

/**
 *
 * @author tvmin
 */
public class Employee {

    public String manv;
    public String ten;
    public double luong;

    public String thue() {
        String Thue;
        if (this.luong < 10000000) {
            Thue = "0";
        } else if (this.luong < 15000000) {
            Thue = "10%";
        } else {
            Thue = "15%";
        }
        return Thue;
    }
}
