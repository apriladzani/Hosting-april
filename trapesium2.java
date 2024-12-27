import java.util.Scanner;

public class trapesium2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang atap: ");
        int atap = input.nextInt();
        System.out.print("Masukkan panjang alas: ");
        int alas = input.nextInt();
        int spasi = alas;
        System.out.print("Masukan tinggi: ");
        int tinggi = input.nextInt();

        System.out.println("Luas Trapesium : " + (float) (alas * atap) / 2 * tinggi );

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < spasi ; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < atap; j++) {
                    System.out.print("*");
                }
                atap = atap + 2;
                spasi--;
                System.out.println();
            }
        }
    }





    

