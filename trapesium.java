
import java.util.Scanner;

public class trapesium {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang atap: ");
        int atap = input.nextInt();
        System.out.print("Masukkan panjang alas: ");
        int alas = input.nextInt();
        System.out.print("Masukan tinggi: ");
        int tinggi = input.nextInt();

        for (int i = atap ; i <= tinggi; i++) {
            for (int j = 1 ; j <= i ; j++) {
                    System.out.print("* ");
                }
                System.out.println("");        
            }
            System.out.println("Luas Trapesium : " + (float) (alas * atap) / 2 * tinggi );
        }



    }

