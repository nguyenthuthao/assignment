/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thao;

/**
 *
 * @author tvmin
 */
public class Student {
    public String maSv;
    public String hoTen;
    public double diem;
    public String xepLoai(){
        String xeploai;
        if(this.diem<5){
            xeploai="Yeu";
        }else if(this.diem<7){
            xeploai="Trung Binh";
        }else if(this.diem<8){
            xeploai="Kha";
        }else if(this.diem<9){
            xeploai="Gioi";
        }else{
            xeploai="Xuat sac";
        }
        return xeploai;
    }
}
