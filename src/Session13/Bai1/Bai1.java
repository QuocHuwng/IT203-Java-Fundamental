package Session13.Bai1;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {

    public static void main(String[] args) {

        ArrayList<Double> danhSach = new ArrayList<>();
        danhSach.add(36.5);
        danhSach.add(40.2);
        danhSach.add(37.0);
        danhSach.add(12.5);
        danhSach.add(39.8);
        danhSach.add(99.9);
        danhSach.add(36.8);

        System.out.println("Danh sách ban đầu: " + danhSach);

        Iterator<Double> it = danhSach.iterator();

        while (it.hasNext()) {
            Double nhietDo = it.next();
            if (nhietDo < 34.0 || nhietDo > 42.0) {
                it.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + danhSach);

        double tong = 0;
        for (Double nhietDo : danhSach) {
            tong += nhietDo;
        }

        double trungBinh = tong / danhSach.size();
        System.out.printf("Nhiệt độ trung bình: %.2f", trungBinh);
    }
}