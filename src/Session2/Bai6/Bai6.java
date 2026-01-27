package Session2.Bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int luotMuon;
        int max = -1;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int dem = 0;

        String[] ngay = {
                "Thu 2", "Thu 3", "Thu 4",
                "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"
        };

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + ngay[i] + ": ");
            luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            if (luotMuon > max) {
                max = luotMuon;
            }

            if (luotMuon < min) {
                min = luotMuon;
            }

            tong += luotMuon;
            dem++;
        }

        double trungBinh = (dem > 0) ? (double) tong / dem : 0;

        System.out.println();
        System.out.println("--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + trungBinh);

        sc.close();
    }
}
