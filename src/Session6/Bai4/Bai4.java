package Session6.Bai4;

public class Bai4 {
    static class Employee {
        private String MaNV;
        private String TenNV;
        private double Luong;

        public Employee() {
            this.MaNV = "chua co";
            this.TenNV = "chua co";
            this.Luong = 0;
        }

        public Employee(String MaNV, String TenNV) {
            this.MaNV = MaNV;
            this.TenNV = TenNV;
            this.Luong = 0;
        }

        public Employee(String MaNV, String TenNV, double Luong) {
            this.MaNV = MaNV;
            this.TenNV = TenNV;
            this.Luong = Luong;
        }

        public void show() {
            System.out.println("Ma nhan vien: " + MaNV);
            System.out.println("Ten nhan vien: " + TenNV);
            System.out.println("Luong nhan vien: " + Luong);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        Employee nv1 = new Employee();
        nv1.show();

        Employee nv2 = new Employee("B123", "Huy Huy");
        nv2.show();

        Employee nv3 = new Employee("B124", "Hieu Hieu", 10000);
        nv3.show();
    }
}
