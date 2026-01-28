package Session4.Bai6;

import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] blacklist = {"tệ", "ngu ngốc", "đáng đọc"};

        for (String word : blacklist) {
            String replacement = "*".repeat(word.length());
            review = review.replaceAll("(?i)" + Pattern.quote(word), replacement);
        }

        if (review.length() > 200) {
            int lastSpace = review.lastIndexOf(" ", 200);
            review = review.substring(0, lastSpace) + "...";
        } else {
            int firstDot = review.indexOf(".");
            if (firstDot != -1) {
                review = review.substring(0, firstDot + 1) + "..";
            }
        }

        System.out.println("Review sau khi xử lý: " + review);
    }
}