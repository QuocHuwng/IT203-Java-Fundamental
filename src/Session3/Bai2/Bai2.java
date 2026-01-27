package Session3.Bai2;

import java.util.Scanner;

public class Bai2 {

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = {"Doraemon", "Conan", "Dragon Ball", "One Piece", "Naruto"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách cần tìm: ");
        String searchTitle = sc.nextLine();

        int index = searchBooks(books, searchTitle);

        if (index != -1) {
            System.out.println("Tìm thấy sách '" + searchTitle + "' tại vị trí số: " + index);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }

        sc.close();
    }
}