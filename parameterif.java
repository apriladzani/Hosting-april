import java.util.Scanner;

public class parameterif {

    public static double tunjangangaji(){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Gaji Kotor: ");
        double gajiKotor = input.nextInt();
        System.out.print("Masukan Jumlah Anak: ");
        int anak = input.nextInt();

        if (anak < 3) {
            double tunjangan=0;
            tunjangan = gajiKotor * 0.2;
            System.out.println("Jumlah Tunjangan: " + tunjangan);
        }else if (anak >= 3) {
            double tunjangan=0;
            tunjangan = gajiKotor * 0.3;
            System.out.println("Jumlah Tunjangan: " + tunjangan);
    }
            return anak;
}
    public static void main(String[] args) {
        tunjangangaji();
    }
}
