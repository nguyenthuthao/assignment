/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaontph06790;

/**
 *
 * @author tvmin
 */
public class Sinhvien {

    public String hoTen;
    public String maSo;
    public double diem;

    public String hocLuc() {
        String hocLuc;
        if (this.diem < 5) {
            hocLuc = "Yeu";
        } else if (this.diem < 7) {
            hocLuc = "Kha";
        } else if (this.diem < 9) {
            hocLuc = "Gioi";
        } else {
            hocLuc = "Xuat sac";
        }
        return hocLuc;
    }
}
