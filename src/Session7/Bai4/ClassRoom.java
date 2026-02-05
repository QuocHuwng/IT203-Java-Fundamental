<<<<<<< HEAD
package Session7.Bai4;

public class ClassRoom {
    private String studentName;
    public static double classFund = 0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng: " + amount);
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}
=======
package Session7.Bai4;

public class ClassRoom {
    private String studentName;
    public static double classFund = 0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng: " + amount);
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}
>>>>>>> 0236bc55f61a607043b1e30bee45a92e3217d825
