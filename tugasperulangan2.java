import java.util.Scanner;

public class tugasperulangan2{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int N  = input.nextInt();

            // Pekerjaan anda dimulai dari sini

            while(N < 2 || N > 20) {
                N = -1;
                System.out.println(N);
                break;
            }

            while(N >= 2 && N <= 20) {
                N *= 3;
                for (int i = 3; i <= N; i+=3) {
                System.out.println(i);
                }
                break;
            } 

            //Pekerjaan anda berakhir disini
        }
    }
