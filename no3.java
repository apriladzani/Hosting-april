import java.util.ArrayList;
import java.util.Scanner;

public class no3 {
    static ArrayList<Integer> pemilihan = new ArrayList<>();

    static void hitungPemenang() {
        int kotakKosong = 0, Calon1 = 0, Calon2 = 0;
        for (int i = 0; i < pemilihan.size(); i++) {
            if (pemilihan.get(i) == 0) {
                kotakKosong += 1;
            } else if (pemilihan.get(i) == 1) {
                Calon1 += 1;
            } else if (pemilihan.get(i) == 2) {
                Calon2 += 1;
            }
        }

        if (kotakKosong > Calon1 && kotakKosong > Calon2) {
            System.out.println("Kotak Kosong Menang");
        } else if (Calon1 > kotakKosong && Calon1 > Calon2) {
            System.out.println("Yang terpilih sebagai ketua kelas adalah no 1 dengan jumlah suara " + Calon1);
        } else if (Calon2 > kotakKosong && Calon2 > Calon1) {
            System.out.println("Yang terpilih sebagai ketua kelas adalah no 2 dengan jumlah suara " + Calon2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean a = true;
        int pilihan = 0;
        while (a) {
            System.out.println("Suara terpilih? [0] Kotak Kosong [1] Aku-Kamu [2] Dia-Anda ");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 0:
                    pemilihan.add(pilihan);
                    break;
                case 1:
                    pemilihan.add(pilihan);
                    break;
                case 2:
                    pemilihan.add(pilihan);
                    break;
                default:
                    System.out.println("Tidak ada calon yang anda pilih " + pilihan);
                    break;
            }
            System.out.println("Input lagi [Y/N]?");
            input.nextLine();
            String ulang = input.nextLine();
            if (ulang.equals("Y") || ulang.equals("y")) {
                a = true;
            } else {
                a = false;
            }
        }

        hitungPemenang();

    }
}
