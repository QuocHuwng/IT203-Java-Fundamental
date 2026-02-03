package Session7.Bai3;

public class Program {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("\n>> Kết quả xử lý:\n- Điểm trung bình cả lớp: %.2f\n", avg);

        for (double score : scores) {
            System.out.println("- Điểm " + score + ": "
                    + (ScoreUtils.checkPass(score) ? "Đạt" : "Trượt"));
        }
    }
}
