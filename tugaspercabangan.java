
import java.util.Scanner;

public class tugaspercabangan {
    public static void main(String[] args){
        int gajiPokok = 5000000;
        int uangLembur = 50000;
        int lamaKerja, jumlahJamKerja, jumlahJamLembur;
        double totalGaji;
        double bonus;
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Masa Kerja :");
        lamaKerja       = scanner.nextInt();
        System.out.print("Masukan Jumlah Jam Kerja :");
        jumlahJamKerja  = scanner.nextInt();

        if (lamaKerja < 5){
            bonus = 0;
        } else if (lamaKerja >=5 && lamaKerja <=10){
            bonus = gajiPokok * 0.05;
        } else {
            bonus = gajiPokok * 0.10;
        }

        if (jumlahJamKerja > 40) {
            jumlahJamLembur = jumlahJamKerja - 40;
        } else {
            jumlahJamLembur = 0;
        }

        totalGaji = gajiPokok + bonus + (jumlahJamLembur * uangLembur);
        System.out.println("Total Gaji :" + totalGaji);

        scanner.close();
    }
}