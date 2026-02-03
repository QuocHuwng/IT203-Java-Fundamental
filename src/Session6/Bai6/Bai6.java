package Session6.Bai6;

public class Bai6 {

    static class User {
        private int id;
        private String username;
        private String password;
        private String email;

        public User(int id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public void setPassword(String password) {
            if (password == null || password.trim().isEmpty()) {
                System.out.println("Password khong duoc rong");
            } else {
                this.password = password;
            }
        }

        public void setEmail(String email) {
            if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                this.email = email;
            } else {
                System.out.println("Email khong hop le");
            }
        }

        public void show() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
        }
    }

    public static void main(String[] args) {
        User u1 = new User(1, "hung123", "123456", "hung@gmail.com");
        u1.show();

        User u2 = new User(2, "testuser", "", "saiemail");
        u2.show();

        User u3 = new User(3, "admin", "admin123", "admin@gmail.com");
        u3.show();
    }
}
