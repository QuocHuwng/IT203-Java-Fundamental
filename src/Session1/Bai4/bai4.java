package Session1.Bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = sc.nextDouble();

        float exchangeRate = 25450.0f;

        double totalVND = priceUSD * exchangeRate;

        long roundedVND = (long) totalVND;

        System.out.println("Giá chính xác (số thực): " + totalVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);

        sc.close();
    }
}
