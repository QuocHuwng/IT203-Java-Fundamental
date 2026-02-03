package Session7.Bai1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Hung");
        Student s2 = new Student("SV02", "Nam");
        Student s3 = new Student("SV03", "Linh");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        Student.showTotalStudent();
    }
}
