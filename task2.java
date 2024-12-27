
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total;
        double omset;
        double diskon;
        double harga = 0;
        int jumlahPembelian = 0;
        String boneka;
        String masukan;

        System.out.print("Masukan nama produk [Labubu/Jenglot/Voodo]:");
        boneka = scanner.nextLine();

        System.out.print("jumlah pembelian: ");
        jumlahPembelian = scanner.nextInt();

        System.out.print("Input lagi (Y/N)?:");
        masukan = scanner.nextLine();


        switch (boneka) {
            case "Labubu" : 
            harga = 300000;
                break;
            case "Jenglot" :
            harga = 250000;
                break;
            case "Voodo" :
            harga = 200000;
        }

        if (harga >= 50000 && harga < 100000 ) {
           harga = harga * 0.9;
        }
        else if (harga >= 100000) {
           harga = harga * 0.85;
        }
        else {
           harga = harga;
        }
     
        omset = jumlahPembelian * harga; 
        System.out.println("Jumlah uang yang diterima =  " + omset);
        

        scanner.close();
    }
}
