package Session7.Bai1;

public class Student {
    private String id;
    private String name;
    static int totalStudent = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void showInfo() {
        System.out.println("Ma SV: " + id + ", Ten SV: " + name);
    }

    public static void showTotalStudent() {
        System.out.println("Tong so sinh vien: " + totalStudent);
    }
}
