
import java.util.Scanner;

/**
 *
 * @author tvmin
 */
public class Sinhvien {
    public String hoTen;
    public double diemTB;

    public Sinhvien() {
    }

    public Sinhvien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
 public String xepLoai(){
     String xeploai;
     if(this.diemTB<5){
         xeploai="yếu";
     }else{
         xeploai="giỏi";
     }
     return xeploai;
 }
       public void nhaptt(){
           Scanner scanner=new Scanner(System.in);
           System.out.print("Nhap ho ten: ");
           String hoten = scanner.nextLine();
           System.out.print("Nhap diem: ");
           double diem= scanner.nextDouble();
       }
       public void xuattt(){
           System.out.println("");
       }
}
