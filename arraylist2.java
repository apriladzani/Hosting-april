import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan bilangan 
        ArrayList<Integer> bilanganList = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah bilangan
        System.out.print("Masukkan jumlah bilangan yang ingin diisikan: "); 
        int jumlahBilangan = scanner.nextInt();

        // Memasukkan bilangan ke dalam ArrayList 
        for (int i = 0; i < jumlahBilangan; i++) {
        System.out.print("Masukkan bilangan ke-" + (i + 1) + ": "); 
        int bilangan = scanner.nextInt(); 
        bilanganList.add(bilangan);
        }

        scanner.close();
        
        // Menghitung jumlah semua bilangan 
        int total = 0;
        for (int bilangan : bilanganList) {
        total += bilangan;
        }
        // Menampilkan hasil
        System.out.println("\nDaftar bilangan: " + bilanganList); 
        System.out.println("Jumlah total semua bilangan: " + total);
    }
}
