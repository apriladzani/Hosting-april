import java.util.ArrayList;
import java.util.Scanner;

class User {
    String nama;
    String biografi;
    String status;

    public User(String nama, String biografi, String status) {
         this.nama = nama;
         this.biografi = biografi;
         this.status = status;
    }

    @Override
    public String toString() {
         return "Nama: " + nama + ", Biografi: " + biografi + ", Status: " + status;
    }
}

public class tubes {

     public static void main(String[] args) {
          ArrayList<User> users = new ArrayList<>();
          Scanner input = new Scanner(System.in);
          int pilihanUtama;

          do {
               System.out.println("\n=== Menu Utama ===");
               System.out.println("1. Tambah User");
               System.out.println("2. Edit User");
               System.out.println("3. Hapus User");
               System.out.println("4. Tampilkan Semua User");
               System.out.println("5. Keluar");
               System.out.print("Pilih menu: ");
               pilihanUtama = input.nextInt();
               input.nextLine();

               switch (pilihanUtama) {
                    case 1:
                         tambahUser(users, input);
                         break;
                    case 2:
                         editUser(users, input);
                         break;
                    case 3:
                         hapusUser(users, input);
                         break;
                    case 4:
                         tampilkanUsers(users);
                         break;
                    case 5:
                         System.out.println("Terima kasih! Keluar dari program...");
                         break;
                    default:
                         System.out.println("Pilihan tidak valid!");
               }
          } while (pilihanUtama != 5);

          input.close();
     }

     // Fungsi untuk menambahkan user
     public static void tambahUser(ArrayList<User> users, Scanner input) {
          System.out.print("Masukkan nama: ");
          String nama = input.nextLine();
          System.out.print("Masukkan biografi: ");
          String biografi = input.nextLine();
          System.out.print("Masukkan status: ");
          String status = input.nextLine();

          users.add(new User(nama, biografi, status));
          System.out.println("User berhasil ditambahkan!");
     }

     // Fungsi untuk mengedit user
     public static void editUser(ArrayList<User> users, Scanner input) {
          if (users.isEmpty()) {
               System.out.println("Tidak ada user yang dapat diedit.");
               return;
          }

          tampilkanUsers(users);
          System.out.print("Masukkan indeks user yang ingin diedit: ");
          int index = input.nextInt();
          input.nextLine();

          if (index >= 1 && index <= users.size()) {
               User user = users.get(index - 1);

               System.out.print("Masukkan nama baru (kosongkan untuk tidak mengubah): ");
               String namaBaru = input.nextLine();
               if (!namaBaru.isEmpty())
                    user.nama = namaBaru;

               System.out.print("Masukkan biografi baru (kosongkan untuk tidak mengubah): ");
               String biografiBaru = input.nextLine();
               if (!biografiBaru.isEmpty())
                    user.biografi = biografiBaru;

               System.out.print("Masukkan status baru (kosongkan untuk tidak mengubah): ");
               String statusBaru = input.nextLine();
               if (!statusBaru.isEmpty())
                    user.status = statusBaru;

               System.out.println("User berhasil diperbarui!");
          } else {
               System.out.println("Indeks tidak valid!");
          }
     }

     // Fungsi untuk menghapus user
     public static void hapusUser(ArrayList<User> users, Scanner input) {
          if (users.isEmpty()) {
               System.out.println("Tidak ada user yang dapat dihapus.");
               return;
          }

          tampilkanUsers(users);
          System.out.print("Masukkan indeks user yang ingin dihapus: ");
          int index = input.nextInt();
          input.nextLine();

          if (index >= 1 && index <= users.size()) {
               users.remove(index - 1);
               System.out.println("User berhasil dihapus!");
          } else {
               System.out.println("Indeks tidak valid!");
          }
     }

     // Fungsi untuk menampilkan semua user
     public static void tampilkanUsers(ArrayList<User> users) {
          if (users.isEmpty()) {
               System.out.println("Belum ada user yang ditambahkan.");
          } else {
               System.out.println("Daftar User:");
               for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + ". " + users.get(i));
               }
          }
     }
}

