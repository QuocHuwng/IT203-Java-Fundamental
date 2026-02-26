package Session13.Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {

    static List<Patient> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updatePatient();
                    break;
                case 3:
                    deletePatient();
                    break;
                case 4:
                    displayPatients();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chọn sai!");
            }
        }
    }

    static void menu() {
        System.out.println("1. Thêm bệnh nhân");
        System.out.println("2. Cập nhật bệnh nhân");
        System.out.println("3. Xóa bệnh nhân");
        System.out.println("4. Hiển thị danh sách");
        System.out.println("5. Thoát");
        System.out.print("Chọn: ");
    }

    static void addPatient() {
        System.out.print("Nhập mã bệnh nhân: ");
        String id = sc.nextLine();

        for (Patient p : list) {
            if (p.getPatientId().equals(id)) {
                System.out.println("Mã đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập bệnh: ");
        String disease = sc.nextLine();

        list.add(new Patient(id, name, age, disease));
        System.out.println("Thêm thành công!");
    }

    static void updatePatient() {
        while (true) {
            System.out.print("Nhập mã bệnh nhân: ");
            String id = sc.nextLine();

            Patient found = null;
            for (Patient p : list) {
                if (p.getPatientId().equals(id)) {
                    found = p;
                    break;
                }
            }

            if (found == null) {
                System.out.println("Không tìm thấy, nhập lại!");
            } else {
                System.out.print("Nhập tên mới: ");
                found.setPatientName(sc.nextLine());
                System.out.print("Nhập tuổi mới: ");
                found.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhập bệnh mới: ");
                found.setDisease(sc.nextLine());
                System.out.println("Cập nhật thành công!");
                break;
            }
        }
    }

    static void deletePatient() {
        System.out.print("Nhập mã cần xóa: ");
        String id = sc.nextLine();

        Patient found = null;
        for (Patient p : list) {
            if (p.getPatientId().equals(id)) {
                found = p;
                break;
            }
        }

        if (found == null) {
            System.out.println("Không tồn tại!");
        } else {
            list.remove(found);
            System.out.println("Xóa thành công!");
        }
    }

    static void displayPatients() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.printf("%-10s %-20s %-10s %-20s\n",
                "Mã", "Tên", "Tuổi", "Bệnh");

        for (Patient p : list) {
            System.out.printf("%-10s %-20s %-10d %-20s\n",
                    p.getPatientId(),
                    p.getPatientName(),
                    p.getAge(),
                    p.getDisease());
        }
    }
}