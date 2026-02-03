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
