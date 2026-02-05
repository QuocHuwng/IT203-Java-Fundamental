package Session9.Bai6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));

        double totalArea = 0;
        int index = 1;

        for (Shape s : shapes) {
            double area = s.calculateArea();

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println(index + ". Hình tròn (r=" + c.getRadius() + ") - Diện tích: " + String.format("%.2f", area));
            } else {
                Rectangle r = (Rectangle) s;
                if (r.getWidth() == r.getHeight()) {
                    System.out.println(index + ". Hình vuông (cạnh " + r.getWidth() + ") - Diện tích: " + area);
                } else {
                    System.out.println(index + ". Hình chữ nhật (" + r.getWidth() + " x " + r.getHeight() + ") - Diện tích: " + area);
                }
            }

            totalArea += area;
            index++;
        }

        System.out.println("=> Tổng diện tích các hình: " + String.format("%.2f", totalArea));
    }
}
