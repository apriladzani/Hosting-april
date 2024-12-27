import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] daftarBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] hargaBuku = {350000, 450000, 500000, 95000};

        System.out.print("Daftar Buku: ");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.print(" "+daftarBuku[i] + " " + hargaBuku[i]);
        }

        ArrayList<Integer> hargaBelanja = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.print("Masukan pilihan buku [1/2/3/4]:");
            int pilihan = scanner.nextInt();
            hargaBelanja.add(hargaBuku[pilihan - 1]);
            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("N")) {
                a = false;
            }
        }

        int totalHarga = hitungTotalHarga(hargaBelanja);
        int voucherBelanja = hitungVoucherBelanja(totalHarga);
        System.out.print("Total voucher belanja = " + voucherBelanja);
        System.out.printf("Total yang harus dibayar = " + (totalHarga - voucherBelanja));
    }

    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int totalHarga = 0;
        for (int harga : hargaBelanja) {
            totalHarga += harga;
        }
        return totalHarga;
    }

    public static int hitungVoucherBelanja(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga >= 200000 && totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga > 500000 && totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga > 750000 && totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }
}