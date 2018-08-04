package thao;

/**
 *
 * @author tvmin
 */
import java.util.ArrayList;

public class QuanLyStudent {

    ArrayList<Student> nhapDanhSachHocSinh() {
        keyboard k = new keyboard();
        ArrayList<Student> hv = new ArrayList<>();
        int n = k.readInt("Nhap so phan tu: ");
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("------Hoc vien thu:" + (i + 1) + "-------");
            student.maSv = k.readString("Nhap vao ma sinh vien: ");
            student.hoTen = k.readString("Nhap vao ho ten: ");
            student.diem = k.reaDouble("Nhap vao diem: ");
            hv.add(student);
        }
        return hv;
    }

    void xuatDanhSachHocVien(ArrayList<Student> hocviens) {
        System.out.println("---Danh sach hoc vien vua nhap: ");
        System.out.printf("%10s\t %10s\t %10s\t %10s\t\n", "Ma sinh vien", "Ho ten", "Diem", "Xep loai");
        for (int i = 0; i < hocviens.size(); i++) {
            Student st = hocviens.get(i);
            System.out.printf("%10s\t %10s\t %10.1f\t %10s\t\n", st.maSv, st.hoTen, st.diem, st.xepLoai());
        }
    }

        ArrayList<Student> timHocLuc(String hocLuc, ArrayList<Student> listHocVien) {
        ArrayList<Student> listHocVienTam = new ArrayList<>();
        for (int i = 0; i < listHocVien.size(); i++) {
            Student hv = listHocVien.get(i);
            if (hv.xepLoai().equals(hocLuc)) {
                listHocVienTam.add(hv);
            }
        }
        return listHocVienTam;
    }
    
        void sapXepHocVien(ArrayList<Student> listHocVien) {

        boolean doi = true;
        int j = 0;
        Student temp;
        while (doi) {
            doi = false;
            j++;
            for (int i = 0; i < listHocVien.size() - j; i++) {
                if (listHocVien.get(i).diem < listHocVien.get(i + 1).diem) {
                    temp = listHocVien.get(i);
                    listHocVien.set(i, listHocVien.get(i + 1));
                    listHocVien.set(i + 1, temp);
                    doi = false;
                }
            }
        }
    }
}
