package Session2.Bai1;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int soSachDangMuon= sc.nextInt();

        if (tuoi >= 18 && soSachDangMuon < 3){
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem ");
        }
        else if (tuoi < 18) {
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("Ly do: Ban phai tu 18 tuoi tro len");
        }else {
            System.out.println("Ket qua: Khong du dieu kien ");
            System.out.println("Ly do: Ban da muon toi da 3 cuon ");
        }
        sc.close();
    }
}
