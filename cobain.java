import java.util.Scanner;

public class cobain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jamLembur;
        double honorLembur;

        System.out.print("Total jam lembur : ");
        jamLembur = scanner.nextInt();
        
        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000;
            System.out.println("Honor Lembur : " + honorLembur);
        } else {
            honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
        }
        
        System.out.print("Honor lembur : " + honorLembur);
        
        scanner.close();
    }
}

