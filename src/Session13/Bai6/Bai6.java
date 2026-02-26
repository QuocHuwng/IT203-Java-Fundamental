package Session13.Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {

    static List<Medicine> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Chọn sai!");
            }
        }
    }

    static void menu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : list) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Nhập số lượng thêm: ");
                int qty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + qty);
                System.out.println("Cộng dồn số lượng thành công!");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thuốc: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        list.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công!");
    }

    static void updateQuantity() {
        if (list.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }

        while (true) {
            System.out.print("Nhập mã thuốc: ");
            String id = sc.nextLine();

            Medicine found = null;
            for (Medicine m : list) {
                if (m.getDrugId().equals(id)) {
                    found = m;
                    break;
                }
            }

            if (found == null) {
                System.out.println("Không tìm thấy thuốc, nhập lại!");
            } else {
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    list.remove(found);
                    System.out.println("Đã xóa thuốc khỏi đơn!");
                } else {
                    found.setQuantity(newQty);
                    System.out.println("Cập nhật thành công!");
                }
                break;
            }
        }
    }

    static void deleteMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        Medicine found = null;
        for (Medicine m : list) {
            if (m.getDrugId().equals(id)) {
                found = m;
                break;
            }
        }

        if (found == null) {
            System.out.println("Id thuốc không tồn tại!");
        } else {
            list.remove(found);
            System.out.println("Xóa thành công!");
        }
    }

    static void printInvoice() {
        if (list.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }

        double total = 0;

        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n",
                "Mã", "Tên", "Đơn giá", "S.Lượng", "Thành tiền");

        for (Medicine m : list) {
            System.out.printf("%-10s %-20s %-10.2f %-10d %-10.2f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    m.getTotal());
            total += m.getTotal();
        }

        System.out.println("Tổng tiền: " + total + " VNĐ");

        list.clear();
    }

    static void findCheapMedicine() {
        boolean found = false;

        System.out.printf("%-10s %-20s %-10s\n",
                "Mã", "Tên", "Đơn giá");

        for (Medicine m : list) {
            if (m.getUnitPrice() < 50000) {
                System.out.printf("%-10s %-20s %-10.2f\n",
                        m.getDrugId(),
                        m.getDrugName(),
                        m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá rẻ!");
        }
    }
}