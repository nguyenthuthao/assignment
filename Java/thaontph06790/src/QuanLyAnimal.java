
import java.util.ArrayList;

/**
 *
 * @author tvmin
 */
public class QuanLyAnimal {

    ArrayList<Animal> nhapDachSachAnimal() {
        Keyboard k = new Keyboard();
        ArrayList<Animal> anm = new ArrayList<>();
        int n = k.readInt("Nhap so phan tu:");
        for (int i = 0; i < n; i++) {
            Animal animal = new Animal();
            System.out.println("-----Animal thu " + (i + 1) + "-----");
            animal.Name = k.readString("Nhap ten: ");
            animal.Color = k.readString("Nhap mau: ");
            animal.Weight = k.reaDouble("Nhap weight: ");
            anm.add(animal);
        }
        return anm;
    }

    void xuatDanhSachAnimal(ArrayList<Animal> animals) {
        System.out.println("-----Danh sach animal vua nhap:-----");
        System.out.printf("%-10s %-20s %-20s\n", "Name", "Color", "Weight");
        for (int i = 0; i < animals.size(); i++) {
            Animal an = animals.get(i);
            System.out.printf("%-10s %-20s %-20s\n", an.Name, an.Color, an.status());
        }
    }

    ArrayList<Animal> timstatus(String status, ArrayList<Animal> listAnimal) {
        ArrayList<Animal> listAnimaltam = new ArrayList<>();
        for (int i = 0; i < listAnimal.size(); i++) {
            Animal an = listAnimal.get(i);
            if (an.status().equals(status)) {
                listAnimaltam.add(an);
            }
        }
        return listAnimaltam;
    }

    void sapXepAnimal(ArrayList<Animal> listAnimal) {

        boolean doi = true;
        int j = 0;
        Animal temp;
        while (doi) {
            doi = false;
            j++;
            for (int i = 0; i < listAnimal.size() - j; i++) {
                if (listAnimal.get(i).Weight > listAnimal.get(i + 1).Weight) {
                    temp = listAnimal.get(i);
                    listAnimal.set(i, listAnimal.get(i + 1));
                    listAnimal.set(i + 1, temp);
                    doi = false;
                }
            }
        }
    }

}
