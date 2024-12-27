import java.util.Scanner;

public class segitiga {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan alas segitiga: ");
      int alas = input.nextInt();
      System.out.print("Masukkan tinggi segitiga: ");
      int tinggi = input.nextInt();

      for (int i = 1; i <= tinggi; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println("");
      }
      System.out.println("Luas Segitiga : " + (float) (alas * tinggi) / 2);
  }
}


