package Session4.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đoạn mô tả: ");
        String description = scanner.nextLine();

        String key = "Kệ:";

        if (description.contains(key)) {
            int startIndex = description.indexOf(key) + key.length();
            int endIndex = description.indexOf(",", startIndex);

            if (endIndex == -1) {
                endIndex = description.length();
            }

            String code = description.substring(startIndex, endIndex).trim();
            System.out.println("Vị trí tìm thấy: " + code);

            String newDescription = description.replace(key, "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: " + newDescription);
        } else {
            System.out.println("Không tìm thấy từ khóa 'Kệ:'");
        }

        scanner.close();
    }
}