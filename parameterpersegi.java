import java.util.Scanner;

public class parameterpersegi {

    public static void hitung (int panjang, int lebar) {
        int hasil = panjang * lebar;
        System.out.println("Hasil luas persergi panjang: " + hasil);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukan lebar: ");
        int lebar = input.nextInt();
        hitung(panjang, lebar);

        hitung(10, 5);
    }
}
