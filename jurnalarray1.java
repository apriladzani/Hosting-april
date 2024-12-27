public class jurnalarray1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("Total = " + total);
    }
}
