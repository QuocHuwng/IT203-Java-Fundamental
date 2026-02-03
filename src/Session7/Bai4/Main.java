package Session7.Bai4;

public class Main {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom s2 = new ClassRoom("Trần Thị B");
        ClassRoom s3 = new ClassRoom("Lê Văn C");

        s1.contribute(100000);
        s2.contribute(150000);
        s3.contribute(200000);

        ClassRoom.showClassFund();
    }
}
