package Session7.Bai2;

public class Bai2 {

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Student s1 = new Student("Hung");
        Student s2 = s1;
        s2.name = "Nam";

        System.out.println("Reference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
