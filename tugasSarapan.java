import java.util.Scanner;


public class tugasSarapan{
    public static void main(String[] args){
        int totalBiaya = 0;
        int pilihanMenu;
        double hargaMakanan;
        Scanner input = new Scanner(System.in);

        pilihanMenu = input.nextInt();
        
        // Pekerjaan anda dimulai dari sini
        hargaMakanan = 0;
         if (pilihanMenu == 1) {
            hargaMakanan =  10000;
        }
         else if (pilihanMenu == 2) {
            hargaMakanan = 15000;
        }
         else if (pilihanMenu == 3) {
            hargaMakanan = 20000;
        }
         else if (pilihanMenu == 4) {
            hargaMakanan = 12000;
        }
         else {
            System.out.println("tidak tersedia");
        }
    
        for(int nilai = 1; nilai <= 7; nilai++) {
            if (nilai == 6 || nilai == 7){
                if(hargaMakanan > 11000 ){
                    hargaMakanan *= 0.95;
                }
                else if (hargaMakanan > 15000) {
                    hargaMakanan *= 0.9;
                }
                else{
                    totalBiaya += hargaMakanan ;
                }
            }
        
    }
        totalBiaya += hargaMakanan;



    
        //Pekerjaan anda berakhir disini
        
        System.out.println("Total Biaya : " + totalBiaya );
    }
}
