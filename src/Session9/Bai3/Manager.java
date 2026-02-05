package Session9.Bai3;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Phòng ban: " + department);
    }
}
