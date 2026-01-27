package Session2.Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int soNgayTre;
        int total = 0;
        final int TIEN_PHAT_MOI_NGAY = 5000;

        System.out.print("Nhap so luong sach tra muon: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            soNgayTre = sc.nextInt();

            total += soNgayTre * TIEN_PHAT_MOI_NGAY;
        }

        System.out.println("===> Tong tien phat: " + total + " VND");

        sc.close();
    }
}
