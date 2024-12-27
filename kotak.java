
import java.util.Scanner;

public class kotak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : "); 
        int baris = input.nextInt();
        int jumlahBintang = 0;

        for (int y = 1;  y <= baris; y++) {
            for  (int x = 1; x <= baris; x++) {
                System.out.print("* ");
                jumlahBintang++;
            }
            System.out.println("");
        }
        System.out.println("Jumlah Bintang :"  + jumlahBintang);
    }
}
