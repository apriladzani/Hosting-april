import java.util.ArrayList;
import java.util.Scanner;

public class tugasbesar {
        static ArrayList<String> menu = new ArrayList<>(); 
        static ArrayList<String> profile = new ArrayList<>(); 
        static ArrayList<String> posting = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            boolean a = true;
            while (a) {
                System.out.println("Selamat datang di Simple Social Media");
                System.out.println("1. Daftar");
                System.out.println("2. Posting");
                System.out.println("3. Munculkan Profile dan Posting");
                System.out.println("4. Keluar");
                break;
            }

            while (a) {
                System.out.print("Pilih menu:");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

            switch (pilihan) {
            case 1:
            daftarAkun();
            break;
                    
            case 2:
            posting();
            break;

            case 3:
            munculProfilePosting();
            break;

            case 4:
            a = false;
            System.out.println("Program Selesai");
            break;

            default:
            System.out.println("Pilihan tidak tersedia");
            break;
            }
        }
    }

    public static void daftarAkun(){
        System.out.println("1. Username");
        System.out.println("2. Biography");

        boolean b = true;
            System.out.print("Pilih menu:");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
        while (b) {
            switch (pilihan) {
                case 1:
                usn();
                break;
                
                case 2:
                bio();
                break;

                case 3:
                b = false;
                System.out.println("Program Selesai");
                break;
            
                default:
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        }
    }

    public static void usn (){
        System.out.println("1. Munculkan Username");
        System.out.println("2. Tambah Username");
        System.out.println("3. Edit Username");
        System.out.println("4. Hapus Username");

        boolean c = true;
        System.out.print("Pilih menu:");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        while (c) {
            switch (pilihan) {
                case 1:
                System.out.println("Username: " + menu.get(0));
                break;
                
                case 2:
                System.out.print("Masukkan Username: ");
                String username = scanner.nextLine();
                menu.set(0, username);
                System.out.println("Username berhasil diubah");
                break;

                case 3:
                System.out.print("Masukkan Username baru: ");
                String newUsername = scanner.nextLine();
                menu.set(0, newUsername);
                System.out.println("Username berhasil diedit");
                break;

                case 4:
                menu.remove(0);
                System.out.println("Username berhasil dihapus");
                break;

                case 5:
                c = false;
                break;
            }
        }
    }

    public static void munculusn () {
    }

    public static void tambahUsn () {
        
    }

    public static void bio (){
        System.out.println("1. Munculkan Biography");
        System.out.println("2. Tambah Biography");
        System.out.println("3. Edit Biography");
        System.out.println("4. Hapus Biography");
    }

    // public static void daftarAku() {
    //     System.out.print("Masukkan username: ");
    //     String username = scanner.nextLine();
    //     System.out.print("Masukkan biography: ");
    //     String biography = scanner.nextLine();
    //     menu.add(username);
    //     menu.add(biography);
    //     System.out.println("Akun berhasil dibuat");
    // } 

    public static void posting() {
        System.out.print("Masukkan postingan: ");
        String postingan = scanner.nextLine();
        posting.add(postingan);
    }

    public static void munculProfilePosting() {
        int no = 1;
        for(String nama : menu){
            System.out.println( no + " " + nama);
            no++;   
        }
    }
}
