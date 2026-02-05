package Session6.Bai5;

public class Bai5 {
    static class Book {
        private String maSach;
        private String tenSach;
        private double gia;

        public Book(String maSach, String tenSach, double gia) {
            this.maSach = maSach;
            this.tenSach = tenSach;
            this.gia = gia;
        }

        public void show() {
            System.out.println("Ma sach: " + maSach);
            System.out.println("Ten sach: " + tenSach);
            System.out.println("Gia: " + gia);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("S01", "Lap trinh Java", 85000);
        b1.show();
    }
}
