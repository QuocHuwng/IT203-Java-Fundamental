package Session3.Bai5;

import java.util.Scanner;

public class Bai5 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy mã sách " + bookId);
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa sách mã " + bookId);
        return n - 1;
    }

    public static void displayInventory(int[] arr, int n) {
        System.out.print("Kho sách hiện tại (" + n + " cuốn): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? " " : ""));
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            displayInventory(books, n);
            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int idToRemove = sc.nextInt();

            if (idToRemove == 0) break;

            n = deleteBook(books, n, idToRemove);
        }

        System.out.println("Chương trình kết thúc.");
        sc.close();
    }
}