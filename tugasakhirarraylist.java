import java.util.ArrayList;
import java.util.Scanner;

public class tugasakhirarraylist {
    static ArrayList<String> siswaList = new ArrayList<>(); 
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean a = true;
        while (a) {
            System.out.println("1. Tampil Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar Program");
    
            System.out.print("Masukkan Pilihan: "); 
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
    
            switch (pilihan) {
                case 1: 
                tampilData();
                break;
    
                case 2 :
                tambahData();
    
                break;

                case 3:
                editData();

                break;

                case 4:
                hapusData();

                break;

                case 5 :
                a = false;
                System.out.println("Program Selesai");
                break;

                default: 
                System.out.println("Input salah");
                break;
            }
        }
    }

    public static void tampilData(){
        int no = 1;
        for(String nama : siswaList){
            System.out.println(no + ". " + nama);
            no++;   
        }
        // System.out.println();
    }

    public static void tambahData() {
        System.out.println("Masukan siswa ");
        String nama = scanner.nextLine();
        siswaList.add(nama);
        System.out.println("Siswa telah ditambahkan");
    }

    public static void editData() {
        System.out.println("Indeks ke " );
        int index = scanner.nextInt()-1;
        scanner.nextLine();
        System.out.println("Masukan Nama Baru : ");
        String namaBaru = scanner.nextLine();

        siswaList.set(index, namaBaru);

        System.out.println("Nama telah diubah");
    }

    public static void hapusData() {
        System.out.println("Indeks ke : ");
        int index = scanner.nextInt()-1;
        
        siswaList.remove(index);
        int no = index + 1;

        System.out.println("Siswa ke : " + no + " Sudah di hapus");
    } 

}