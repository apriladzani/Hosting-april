import java.util.Scanner;

public class ass3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        variable(n);
    }

    public static void variable(int n){
        for (int i = 0; i <= n; i++) {
            if (i==0) {
                System.out.print("0 ");
            } else if (i % 3 == 0 ) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
