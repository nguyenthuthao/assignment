
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tvmin
 */
public class Program {

    public static void main(String[] args) {
        QuanLyAnimal quanLy = new QuanLyAnimal();
        ArrayList<Animal> listAnimal = new ArrayList<>();
        Keyboard k = new Keyboard();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("menu-----------menu------------");
            System.out.println("Moi chon: ");
            System.out.println("1.Nhap danh sach Animal");
            System.out.println("2.Xuat danh sach Animal");
            System.out.println("3.Tim kiem Animal");
            System.out.println("4.Sap xep Animal");
            System.out.println("5.Thoat.");
            System.out.print("Moi chon: ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    listAnimal = quanLy.nhapDachSachAnimal();
                    break;
                case 2:
                    quanLy.xuatDanhSachAnimal(listAnimal);
                    break;
                case 3:
                    String status = k.readString("Nhap status: ");
                    ArrayList<Animal> listAnimala=quanLy.timstatus(status, listAnimal);
                    quanLy.xuatDanhSachAnimal(listAnimal);
                    break;
                case 4:
                    quanLy.sapXepAnimal(listAnimal);
                    quanLy.xuatDanhSachAnimal(listAnimal);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Chon khong dung moi chon lai.");
            }
        }
    }
}
