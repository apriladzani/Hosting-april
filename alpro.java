import java.util.Scanner;

public class alpro {
    public static void main(String[] args){
    
    Scanner MyObj = new Scanner(System.in);
    System.out.println("input total belanja");

    Double totalbelanja = MyObj.nextDouble();
    Double diskon ;
    
    if (totalbelanja <10000){
        diskon = 0.;
        Double potonganharga = totalbelanja * diskon;
        Double totalbayar = totalbelanja - potonganharga;
        System.out.println("Potongan Harga: Rp " + potonganharga );
        System.out.println("Total Bayar: Rp " + totalbayar);
    }
    else if(totalbelanja >10000 && totalbelanja <20000){
        diskon = 0.1; 
        Double potonganharga = totalbelanja * diskon;
        Double totalbayar = totalbelanja - potonganharga;
        System.out.println("Potongan Harga: Rp " + potonganharga );
        System.out.println("Total Bayar: Rp " + totalbayar);
        System.out.println("anda dapat diskon 20 persen");
    }
    else if(totalbelanja >20000){
        diskon = 0.2 ;
        Double potonganharga = totalbelanja * diskon;
        Double totalbayar = totalbelanja - potonganharga;
        System.out.println("Potongan Harga: Rp " + potonganharga);
        System.out.println("Total Bayar: " + totalbayar);
    }
    MyObj.close();
 }
}

