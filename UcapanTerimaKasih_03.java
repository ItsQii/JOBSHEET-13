import java.util.Scanner;

public class UcapanTerimaKasih_03 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yg ingin anda beri ucapan: ");
        String NamaOrang = sc.nextLine();
        sc.close();
        return NamaOrang;
}
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world. \n"+"You inspired in me a love for learning and me feel like i could ask you anything.");
}
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}