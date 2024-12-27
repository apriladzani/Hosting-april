import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahAnggotaKeluarga;
        double tunjanganKesehatan;

        System.out.print("Jumlah anggota keluarga:");
        jumlahAnggotaKeluarga = scanner.nextInt();

        if (jumlahAnggotaKeluarga <= 3) {
            tunjanganKesehatan = 100000 * jumlahAnggotaKeluarga;
        }else if (jumlahAnggotaKeluarga > 3){
            tunjanganKesehatan = (100000 * jumlahAnggotaKeluarga) - ((jumlahAnggotaKeluarga - 3) * 50000);
        }else {
            tunjanganKesehatan = 0;
        }

        System.out.println("Besar tunjangan kesehatan = " + tunjanganKesehatan);

        scanner.close();
    }
}
