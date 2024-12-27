
import java.util.Scanner;

public class tugasakhir2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jari-Jari:");
        int jari = input.nextInt();

        // System.out.printf("\nMenghitung Keliling Lingkaran: %.2f", kelilingLingkaran(jari));
        kelilingLingkaran(jari);
        System.out.printf("\nMenghitung Luas Lingkaran: %.2f", luasLingkaran(jari));

    }
    public static void kelilingLingkaran(int jarijari){
        double result = Math.PI * (jarijari + jarijari);
        System.out.printf("\nMenghitung Keliling Lingkaran: %.2f", result);
    }

    public static double luasLingkaran(int jarijari){
        double result = Math.PI * jarijari * jarijari;
        return result;
    }
}
