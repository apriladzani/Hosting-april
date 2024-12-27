import java.util.Arrays;
import java.util.Scanner;

public class tugasakhirarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] transaksi = new int[5]; 
        int jumlahTransaksi = 0;
        int totalPendapatan = 0;
      
        while (jumlahTransaksi < 5) {
            System.out.print("Masukkan nilai transaksi = ");
            int nilaiTransaksi = scanner.nextInt();
            transaksi[jumlahTransaksi] = nilaiTransaksi;
            jumlahTransaksi++;
           
            System.out.print("Input transaksi lagi [Y/N]? ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("N") || jumlahTransaksi == 5) {
                break;
            }
        }

        totalPendapatan = hitungTotalPendapatan(transaksi, jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);
    }

    public static int hitungTotalPendapatan(int[] transaksi, int jumlahTransaksi) {
        int total = 0;
        for (int i = 0; i < jumlahTransaksi; i++) {
            total += transaksi[i];
        }
        return total;
    }
}
