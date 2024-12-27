
import java.util.ArrayList;
import java.util.Scanner;


public class arraylistass {
    static int hitung (ArrayList<Integer>kotakKosong, ArrayList<Integer>aku_kamu, ArrayList<Integer>dia_Anda){
        int pemenang=0;
        if (aku_kamu.size()<dia_Anda.size()){
            pemenang=aku_kamu.size();
        }else if (dia_Anda.size()>aku_kamu.size()) {
            pemenang=dia_Anda.size();
        }else {
            System.out.println(kotakKosong.size());
        }
        return pemenang;
    }

    public static void main(String[] args) {
        ArrayList<Integer> kotakKosong = new ArrayList<>(); 
        ArrayList<Integer> aku_Kamu = new ArrayList<>();
        ArrayList<Integer> dia_Anda = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();

        int pilihan = 0;

        
        switch (pilihan) {
            case 0:
                kotakKosong.add(1);
                System.out.println(kotakKosong.size());
                break;
            
            case 1:
                aku_Kamu.add(1);
                System.out.println(aku_Kamu.size());
                break;

            case 2:
                dia_Anda.add(1);
                System.out.println(dia_Anda.size());
                break;
            default:
        }
    }
}
