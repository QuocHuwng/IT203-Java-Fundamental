package Session6.Bai1;

public class Bai1 {
    static class Student{
        private String MSV;
        private String HoTen;
        private int NamSinh;
        private double TBM;

        public Student(String MSV, String HoTen, int NamSinh, double TBM){
            this.MSV=MSV;
            this.HoTen=HoTen;
            this.NamSinh=NamSinh;
            this.TBM=TBM;
        }

        public void show(){
            System.out.println("Ma SV: " + MSV);
            System.out.println("Ho ten: "+ HoTen);
            System.out.println("Nam sinh: "+ NamSinh);
            System.out.println("Diem trung binh: "+ TBM);
        }
    }
    public static void main(String[] args){
        Student sv1 = new Student("B24DTCN125", "NguyenQuocHung", 2006, 10);
        Student sv2 = new Student("B24DTCN123", "NguyenQuocHuy", 2002, 9);

        sv1.show();
        sv2.show();
    }
}

