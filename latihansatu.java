public class latihansatu {

    public static double hitungluassegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    public static void main(String[] args) {
        double alas = 10;
        double tinggi = 5;
        double luassegitiga = hitungluassegitiga (alas, tinggi);
        System.out.println("Alas = "+ alas); 
        System.out.println("Tinggi = "+ tinggi); 
        System.out.println("Luas segitiga: " + luassegitiga);  
    }
}
