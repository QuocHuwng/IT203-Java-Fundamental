package Session9.Bai5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int index = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.println(index + ". " + e.getName() + " - Lương: " + (long) salary);
            totalSalary += salary;
            index++;
        }

        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + (long) totalSalary);
    }
}
