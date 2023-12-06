import java.util.Scanner;

public class Ucapan_03 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yg ingin anda beri ucapan: ");
        String NamaOrang = sc.nextLine();
        sc.close();
        return NamaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you"+nama+"\nMay the force be with you");
    }
}