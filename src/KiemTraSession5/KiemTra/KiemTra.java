package KiemTraSession5.KiemTra;
import java.util.Scanner;
public class KiemTra {

    static final int MAX = 100;
    static String[] mssvList = new String[MAX];
    static int size = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    hienThi();
                    break;
                case 2:
                    themMoi();
                    break;
                case 3:
                    capNhat();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    static void showMenu() {
        System.out.println("\nMENU");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    static void hienThi() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
    }

    static void themMoi() {
        if (size == MAX) {
            System.out.println("Danh sách đã đầy!");
            return;
        }
        String mssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            mssv = scanner.nextLine();
            if (mssv.matches("B\\d{7}")) {
                break;
            }
            System.out.println("Sai định dạng!");
        }
        mssvList[size++] = mssv;
        System.out.println("Thêm thành công!");
    }

    static void capNhat() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập vị trí cần sửa: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= size) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        String newMssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newMssv = scanner.nextLine();
            if (newMssv.matches("B\\d{7}")) {
                break;
            }
            System.out.println("Sai định dạng!");
        }
        mssvList[index] = newMssv;
        System.out.println("Cập nhật thành công!");
    }

    static void xoa() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (mssvList[i].equalsIgnoreCase(mssv)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy MSSV!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        size--;
        System.out.println("Xóa thành công!");
    }
    static void timKiem() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (mssvList[i].toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". " + mssvList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có kết quả!");
        }
    }
}