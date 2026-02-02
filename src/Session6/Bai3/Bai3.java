package Session6.Bai3;

public class Bai3 {
    static class Product{
        private String MaSP;
        private String TenSP;
        private double Price;

        public Product(String MaSP, String TenSP, double Price) {
            this.MaSP = MaSP;
            this.TenSP = TenSP;
            setPrice(Price);
        }

        public String getMaSP() {
            return MaSP;
        }

        public void setMaSP(String maSP) {
            MaSP = maSP;
        }

        public String getTenSP() {
            return TenSP;
        }

        public void setPrice(double Price){
            if (Price > 0) {
                this.Price = Price;
            } else {
                System.out.println("Gia ban khong hop le (Price > 0)");
            }
        }
        public void show(){
            System.out.println("Ma san pham: "+ MaSP);
            System.out.println("Ten san pham: "+ TenSP);
            System.out.println("Gia san pham: "+ Price);
        }
    }

    public static void main(String[] args) {
        Product SP1 = new Product("B123", "Vot cau long", 100000);
        SP1.show();
        //
        System.out.println("///// Gia khong hop le");
        SP1.setPrice(-5000);
        //
        SP1.show();
    }
}
