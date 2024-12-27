import java.util.ArrayList;
import java.util.Scanner;

class User {
    String nama;
    String status;
    ArrayList<Postingan> postingList; // Menyimpan postingan untuk setiap user

    public User(String nama, String status) {
        this.nama = nama;
        this.status = status;
        this.postingList = new ArrayList<>();
    }

    public void tambahPostingan(String postingan) {
        this.postingList.add(new Postingan(postingan));
    }
}

class Postingan {
    String postingan;
    int likes;
    int dislikes;

    public Postingan(String postingan) {
        this.postingan = postingan;
        this.likes = 0;
        this.dislikes = 0;
    }
}

public class PengelolaanData {
    static ArrayList<User> userList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            clearScreen();
            System.out.println("+++ Selamat Datang di Web Kami +++");
            System.out.println("====================================");
            System.out.println("1. Kelola User");
            System.out.println("2. Kelola Postingan");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Berikan Like atau Dislike");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: kelolaUser(); break;
                case 2: kelolaPostingan(); break;
                case 3: lihatSemua(); break;
                case 4: likeDislikePostingan(); break;
                case 5: {
                    System.out.println("Program selesai.");
                    return;
                }
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void kelolaUser() {
        while (true) {
            clearScreen();
            System.out.println("+++ Kelola User +++");
            System.out.println("====================================");
            System.out.println("1. Tambahkan User");
            System.out.println("2. Hapus User");
            System.out.println("3. Edit User");
            System.out.println("4. Kembali");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: tambahUser(); break;
                case 2: hapusUser(); break;
                case 3: editUser(); break;
                case 4: return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void kelolaPostingan() {
        while (true) {
            clearScreen();
            System.out.println("+++ Kelola Postingan +++");
            System.out.println("====================================");
            System.out.println("1. Tambahkan Postingan");
            System.out.println("2. Hapus Postingan");
            System.out.println("3. Edit Postingan");
            System.out.println("4. Kembali");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: tambahPostingan(); break;
                case 2: hapusPostingan(); break;
                case 3: editPostingan(); break;
                case 4: return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void tambahUser() {
        clearScreen();
        System.out.println("+++ Tambahkan User +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Bio: ");
        String status = scanner.nextLine();
        userList.add(new User(nama, status));
        System.out.println("User berhasil ditambahkan!");
        tunggu();
    }

    public static void hapusUser() {
        clearScreen();
        System.out.println("+++ Hapus User +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;
        for (User user : userList) {
            if (user.nama.equalsIgnoreCase(nama)) {
                userList.remove(user);
                System.out.println("User berhasil dihapus!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("User tidak ditemukan.");
        }
        tunggu();
    }

    public static void editUser() {
        clearScreen();
        System.out.println("+++ Ubah Data Pengguna +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;
        for (User user : userList) {
            if (user.nama.equalsIgnoreCase(nama)) {
                System.out.print("Masukkan Nama Baru: ");
                user.nama = scanner.nextLine();
                System.out.print("Masukkan Bio Baru: ");
                user.status = scanner.nextLine();
                System.out.println("User berhasil diubah!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("User tidak ditemukan.");
        }
        tunggu();
    }

    public static void tambahPostingan() {
        clearScreen();
        System.out.println("+++ Tambah Postingan +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama User: ");
        String namaUser = scanner.nextLine();
        boolean ditemukan = false;
        for (User user : userList) {
            if (user.nama.equalsIgnoreCase(namaUser)) {
                System.out.print("Masukkan Postingan: ");
                String postingan = scanner.nextLine();
                user.tambahPostingan(postingan);
                System.out.println("Postingan berhasil ditambahkan!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("User tidak ditemukan.");
        }
        tunggu();
    }

    public static void hapusPostingan() {
        clearScreen();
        System.out.println("+++ Hapus Postingan +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama User: ");
        String namaUser = scanner.nextLine();
        boolean ditemukan = false;
        for (User user : userList) {
            if (user.nama.equalsIgnoreCase(namaUser)) {
                System.out.print("Masukkan Postingan: ");
                String postingan = scanner.nextLine();
                user.postingList.removeIf(p -> p.postingan.equalsIgnoreCase(postingan));
                System.out.println("Postingan berhasil dihapus!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("User tidak ditemukan.");
        }
        tunggu();
    }

    public static void likeDislikePostingan() {
        clearScreen();
        System.out.println("+++ Like & Dislike postingan +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama User: ");
        String namaUser = scanner.nextLine();
        boolean ditemukan = false;
        for (User user : userList) {
            if (user.nama.equalsIgnoreCase(namaUser)) {
                System.out.print("Masukkan Postingan:");
                System.out.print(" ");
                String postingan = scanner.nextLine();
                for (Postingan post : user.postingList) {
                    if (post.postingan.equalsIgnoreCase(postingan)) {
                        System.out.println("1. Like");
                        System.out.println("2. Dislike");
                        System.out.print("Pilih opsi: ");
                        int opsi = scanner.nextInt();
                        scanner.nextLine();
                        switch (opsi) {
                            case 1: 
                                post.likes++;
                                System.out.println("Postingan berhasil di-like!");
                                break;
                            case 2: 
                                post.dislikes++;
                                System.out.println("Postingan berhasil di-dislike!");
                                break;
                            default:
                                System.out.println("Opsi tidak valid!");
                        }
                        ditemukan = true;
                        break;
                    }
                }
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("User atau postingan tidak ditemukan.");
        }
        tunggu();
    }

    public static void lihatSemua() {
        clearScreen();
        if (userList.isEmpty()) {
            System.out.println("Tidak ada user.");
        } else {
            System.out.println("+++ Data Pengguna +++");
            System.out.println(" ");
            for (User user : userList) {
                System.out.println("Nama: " + user.nama);
                System.out.println("Bio: " + user.status);
                System.out.println("Postingan:");
                if (user.postingList.isEmpty()) {
                    System.out.println("  - Tidak ada postingan.");
                } else {
                    for (Postingan post : user.postingList) {
                        System.out.println("  - " + post.postingan);
                        System.out.println("    Likes: " + post.likes + " Dislikes: " + post.dislikes);
                    }
                }
                System.out.println();
            }
        }
        tunggu();
    }

    public static void editPostingan() {
        clearScreen();
        System.out.println("+++ Edit Postingan +++");
        System.out.println(" ");
        System.out.print("Masukkan Nama User: ");
        String namaUser = scanner.nextLine();
        boolean ditemukan = false;
        for (User user : userList) {
            if (user.nama.equalsIgnoreCase(namaUser)) {
                System.out.print("Masukkan Postingan yang akan diedit: ");
                String postinganLama = scanner.nextLine();
                for (Postingan post : user.postingList) {
                    if (post.postingan.equalsIgnoreCase(postinganLama)) {
                        System.out.print("Masukkan Postingan Baru: ");
                        post.postingan = scanner.nextLine();
                        System.out.println("Postingan berhasil diedit!");
                        ditemukan = true;
                        break;
                    }
                }
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Postingan atau user tidak ditemukan.");
        }
        tunggu();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void tunggu() {
        System.out.print("\nTekan Enter untuk melanjutkan...");
        scanner.nextLine();
    }
}
