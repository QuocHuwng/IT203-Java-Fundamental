<<<<<<< HEAD
package Session8_KiemTra;

import java.util.Scanner;

public class KiemTra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int size = 0;
        int choice;
        do {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        String id;
                        while (true) {
                            System.out.print("Nhập mã SV (SVxxx): ");
                            id = sc.nextLine();
                            if (id.matches("SV\\d{3}")) break;
                            System.out.println("Mã sinh viên không hợp lệ");
                        }
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập điểm: ");
                        double score = Double.parseDouble(sc.nextLine());
                        students[size++] = new Student(id, name, score);
                    }
                    break;
                case 2:
                    if (size == 0) {
                        System.out.println("Danh sách trống");
                    } else {
                        for (int i = 0; i < size; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập học lực cần tìm: ");
                    String rank = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println(students[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên");
                    }
                    break;
                case 4:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo học lực giảm dần");
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        } while (choice != 5);
    }
=======
package Session8_KiemTra;

import java.util.Scanner;

public class KiemTra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int size = 0;
        int choice;
        do {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        String id;
                        while (true) {
                            System.out.print("Nhập mã SV (SVxxx): ");
                            id = sc.nextLine();
                            if (id.matches("SV\\d{3}")) break;
                            System.out.println("Mã sinh viên không hợp lệ");
                        }
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập điểm: ");
                        double score = Double.parseDouble(sc.nextLine());
                        students[size++] = new Student(id, name, score);
                    }
                    break;
                case 2:
                    if (size == 0) {
                        System.out.println("Danh sách trống");
                    } else {
                        for (int i = 0; i < size; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập học lực cần tìm: ");
                    String rank = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println(students[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên");
                    }
                    break;
                case 4:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo học lực giảm dần");
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        } while (choice != 5);
    }
>>>>>>> 0236bc55f61a607043b1e30bee45a92e3217d825
}