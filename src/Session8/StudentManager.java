package Session8;

import java.util.Scanner;

public class StudentManager {
    public static Student[] students = new Student[100];
    public static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // CASE 3: Tim sinh vien theo ID hoac ten
    public static void searchStudent() {
        if (count == 0) {
            System.out.println("Danh sach trong");
            return;
        }

        System.out.print("Nhap ma SV hoac ten: ");
        String key = sc.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().toLowerCase().equals(key)
                    || students[i].getFullName().toLowerCase().contains(key)) {

                System.out.println(
                        students[i].getIdStudent() + " - " +
                                students[i].getFullName() + " - " +
                                students[i].getAge() + " - " +
                                students[i].getSex()
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien");
        }
    }
}
