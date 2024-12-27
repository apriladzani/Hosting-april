
import java.util.Scanner;

public class tugasakhir1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input.nextInt();
    
        System.out.print("Nilai Max: " + nilaimax(bil1, bil2, bil3));
    }

    public static int nilaimax (int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else {
            return c;
        }
}
}

    
