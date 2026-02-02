package Session6.Bai2;

public class Bai2 {
    static class Account{
        private String username;
        private String password;
        private String email;

        public Account(String username, String password, String email){
            this.username=username;
            this.password=password;
            this.email=email;
        }
        public void setPassword(String newPass){
            this.password=newPass;
            System.out.println("Doi mat khau thanh cong");
        }
        public void show(){
            System.out.println("UserName: "+ username);
            System.out.println("Email: "+ email);
            System.out.println("PassWord: "+password);
        }
    }

    public static void main(String[] args) {
        Account acc = new Account("QuocHung","123456", "QuocHung@gmail.com" );
        acc.show();
        acc.setPassword("QuocHung");
        acc.show();
    }

}

