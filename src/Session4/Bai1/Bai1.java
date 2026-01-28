package Session4.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = scanner.nextLine();

        title = title.trim().replaceAll("\\s+", " ").toUpperCase();

        author = author.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] words = author.split(" ");
        String resultAuthor = "";
        for (String w : words) {
            resultAuthor += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        resultAuthor = resultAuthor.trim();

        System.out.println("[" + title + "] - Tác giả: " + resultAuthor);

        scanner.close();
    }
}