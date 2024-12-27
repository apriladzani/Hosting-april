
import java.util.Scanner;

public class parameter {
    public static void tambah(int bilangan1, int bilangan2) {
        int hasil = bilangan1 + bilangan2;
        System.out.println("Hasil penjumlahannya adalah: " + hasil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan 1: ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukan bilangan 2: ");
        int bilangan2 = input.nextInt();

        tambah(bilangan1, bilangan2);
        tambah(4, 5);
    }
}
