public class latihandua {
    public static int luasPersegi (int sisi) {
        int result = sisi * sisi;
        return result;
    }

    public static int luasPersegiPanjang (int panjang, int lebar){
        int result = panjang * lebar;
        return result;
    }

    public static double  luasLingkaran (double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Luas Persegi: " + luasPersegi(4));
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang(5, 3));
        System.out.println("Luas Lingkaran: " + luasLingkaran(7));
    }
}
