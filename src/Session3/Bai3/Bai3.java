package Session3.Bai3;

public class Bai3 {

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int q : quantities) {
            if (q > max) max = q;
        }

        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int q : quantities) {
            if (q < min) min = q;
        }

        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Python Pro", "Web Design", "Data Structure", "Java Core", "AI Basics"};
        int[] quantities = {50, 50, 5, 20, 15};

        maxQuantityOfBooks(names, quantities);
        System.out.println("--------------------");
        minQuantityOfBooks(names, quantities);
    }
}