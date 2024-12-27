public class array3 {
    public static void main(String[] args) {
        int[] x = new int[5];

        int a = 1;
        for (int i = 0; i <= 4; i++) {
            x[i] = 10 / a;
            a = a + 1;
        }

        int j = 0;
        for (int i = 4; i >= 0; i--) {
            j = j + x[i];
        }
        System.out.println(j);
        System.out.println("Jumlah semua elemen array adalah: " + j);
    }
} 
