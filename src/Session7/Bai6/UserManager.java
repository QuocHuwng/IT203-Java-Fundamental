<<<<<<< HEAD
package Session7.Bai6;

import java.util.ArrayList;

public class UserManager {

    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void showUsers() {
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }
}
=======
package Session7.Bai6;

import java.util.ArrayList;

public class UserManager {

    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void showUsers() {
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }
}
>>>>>>> 0236bc55f61a607043b1e30bee45a92e3217d825
