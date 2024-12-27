public class array2 {
    public static void main(String[] args) {
        int[] bil = new int [5];

        for (int i = 0; i<=4; i++) {
            bil[i]= 100 - (5 * i);
            System.out.println("Nilai bilangan ke-" + i + " adalah " + bil[i]);
        }
    }
}
