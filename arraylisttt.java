import java.util.ArrayList;

public class arraylisttt {
        public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(34);
        angka.add(12);
        angka.add(67);
        angka.add(23);
        angka.add(89);
        angka.add(2);

        // Algoritma Bubble Sort untuk mengurutkan angka
        boolean urutkan = false;
        while (!urutkan) {
            urutkan = true;  // Anggap sudah terurut
            for (int i = 0; i < angka.size() - 1; i++) {
                if (angka.get(i) > angka.get(i + 1)) {
                    // Tukar elemen
                    int temp = angka.get(i);
                    angka.set(i, angka.get(i + 1));
                    angka.set(i + 1, temp);
                    urutkan = false;  // Set urutkan ke false karena masih ada pertukaran
                }
            }
        }

        // Tampilkan hasil setelah diurutkan
        System.out.println("ArrayList setelah diurutkan: " + angka);

}
}