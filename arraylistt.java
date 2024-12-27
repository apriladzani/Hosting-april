import java.util.ArrayList;
import java.util.Iterator;


public class arraylistt {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(15);
        angka.add(8);
        angka.add(20);
        angka.add(25);
        angka.add(30);

        // Menggunakan iterator untuk menghapus elemen saat iterasi
        Iterator<Integer> iterator = angka.iterator();
        while (iterator.hasNext()) {
            int elemen = iterator.next();
            if (elemen % 2 == 0) {
                iterator.remove();  // Menghapus elemen jika genap
            }
        }

        // Menampilkan ArrayList yang telah dimodifikasi
        System.out.println("ArrayList setelah penghapusan elemen genap: " + angka);
    }

}
