import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);

        int total = 0;
        for (int i = 0; i < angka.size(); i++) {
            total += angka.get(i);
        }

        System.out.println("Total: " + total);
    }

}
