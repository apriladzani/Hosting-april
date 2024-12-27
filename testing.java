
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        // Deklarasi variabel
        int gajiPokok = 5000000;
        int uangLembur = 50000;
        int masaKerja ;
        int jamKerja ;
        int jamLembur ;
        double tambahan ;
        double totalGaji ;

        // Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan masa kerja : ");
        masaKerja = scanner.nextInt();
        System.out.print("Masukkan jumlah jam kerja : ");
        jamKerja = scanner.nextInt();

        // Hitung tambahan berdasarkan masa kerja
        if (masaKerja < 5 ) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = gajiPokok * 0.05; // Tambahan 5%
        } else if (masaKerja >=10 && masaKerja <=20) {
            tambahan = gajiPokok * 0.10; // Tambahan 10%
        } else {
            tambahan = gajiPokok * 0.20;
        }

        // Hitung jam lembur
        if (jamKerja > 40) { // 240 jam = 8 jam/hari * 30 hari
            jamLembur = jamKerja - 40;
        } else {
            jamLembur = 0;
        }

        // Hitung total gaji
        totalGaji = gajiPokok + tambahan + (jamLembur * uangLembur);

        // Tampilkan hasil
        System.out.println("Total gaji yang diterima : Rp " + totalGaji);

        // Tutup scanner
        scanner.close();
    }
}

    
            // Program Menghitung Lama Kerja dan Jumlah Jam Kerja

            // Deklarasi

                // Var gajiPokok = 5000000, uangLembur = 50000, lamaKerja, jumlahJamKerja, jumlahJamLembur, : integer;
                //     totalGaji, bonus, : double;

            // Algoritma

            //     input (lamaKerja);
            //     input (jumlahJamKerja);

            //     if masaKerja < 5 then
            //         output (bonus = 0);
            //     else if masaKerja >= 5 and masaKerja <= 10 then
            //         output (bonus = gajiPokok * 0.05);  
            //     else if masaKerja > 10 then
            //         output (bonus = gajiPokok * 0.10);  
            //     end if

            //     if jumlahJamKerja > 160 then
            //         output (jumlahJamLembur = jumlahJamKerja - 160) ;
            //     else
            //         jumlahJamLembur = 0;
            //     end if

            //     output (totalGaji = gajiPokok + bonus + (jumlahJamLembur * uangLembur));

            // End




