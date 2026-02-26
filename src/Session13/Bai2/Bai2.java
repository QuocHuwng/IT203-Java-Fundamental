package Session13.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2 {

    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");

        System.out.println("Input: " + input);

        List<String> ketQua = locThuocKhongTrung(input);

        System.out.println("Output: " + ketQua);
    }

    public static List<String> locThuocKhongTrung(List<String> danhSach) {

        List<String> danhSachMoi = new ArrayList<>();

        for (String thuoc : danhSach) {
            if (!danhSachMoi.contains(thuoc)) {
                danhSachMoi.add(thuoc);
            }
        }

        Collections.sort(danhSachMoi);

        return danhSachMoi;
    }
}