import java.util.Scanner;

public class Percobaan6_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan Panjang");
        p = input.nextInt();
        System.out.println("Masukkan Lebar");
        l = input.nextInt();     
        System.out.println("Masukkan Tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah:" + L);
        vol =hitungVolume(t, p, l);
        System.out.println("Volume balok adalah:" + vol);
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungVolume (int Tinggi, int a, int b) {
        int Volume = hitungLuas(a, b)*Tinggi;
        return Volume; 
    }

    
}
