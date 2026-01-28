package Session4.Bai4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã thẻ: ");
        String cardID = scanner.nextLine();

        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            if (!cardID.startsWith("TV")) {
                System.out.println("Thiếu tiền tố TV hoặc không viết hoa");
            } else if (cardID.length() < 6 || !cardID.substring(2, 6).matches("\\d{4}")) {
                System.out.println("Năm không hợp lệ");
            } else {
                System.out.println("Định dạng mã thẻ không đúng (Tổng phải có 11 ký tự)");
            }
        }

        scanner.close();
    }
}