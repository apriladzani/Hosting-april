import java.util.ArrayList;

public class arraylist0 {
        public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(25);
        angka.add(38);
        angka.add(14);
        angka.add(56);
        angka.add(70);
        angka.add(42);

        int angkaCari = 56;
        int posisi = -1;

        // Mencari angka dalam ArrayList
        for (int i = 0; i < angka.size(); i++) {
            if (angka.get(i) == angkaCari) {
                posisi = i;
                break;  // Hentikan pencarian setelah ditemukan
            }
        }

        // Menampilkan hasil pencarian
        if (posisi != -1) {
            System.out.println("Angka ditemukan pada indeks: " + posisi);
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }

}
