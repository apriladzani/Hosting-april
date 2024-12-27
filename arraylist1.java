import java.util.ArrayList;
import java.util.Scanner;  

public class arraylist1 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama buah 
        ArrayList<String> buahList = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah buah
        System.out.print("Masukkan jumlah buah yang ingin diisikan: "); 
        int jumlahBuah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Memasukkan nama buah ke dalam ArrayList 
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.print("Masukkan nama buah ke-" + (i + 1) + ": "); 
            String buah = scanner.nextLine(); 
            buahList.add(buah.toLowerCase()); // Mengonversi ke huruf kecil
        }

        scanner.close();
        // Menghitung jumlah "lemon" di dalam ArrayList 
        int jumlahLemon = 0;
        for (String buah : buahList) {
            if (buah.equals("lemon")) {
                   jumlahLemon++;
            }
        }
        // Menampilkan hasil
        System.out.println("\nDaftar buah: " + buahList); 
        System.out.println("Jumlah 'lemon' dalam daftar: " + jumlahLemon);
    }
}
