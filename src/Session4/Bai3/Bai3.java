package Session4.Bai3;

public class Bai3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        String date = "24/01/2026";

        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        sb.append("Ngày tạo: ").append(date).append("\n");
        for (String t : transactions) {
            sb.append("Giao dịch: ").append(t).append("\n");
        }
        String reportSB = sb.toString();
        long endSB = System.currentTimeMillis();

        System.out.println(reportSB);

        long startS = System.currentTimeMillis();
        String reportS = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportS += "Ngày tạo: " + date + "\n";
        for (String t : transactions) {
            reportS += "Giao dịch: " + t + "\n";
        }
        long endS = System.currentTimeMillis();

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: " + (endS - startS));
    }
}