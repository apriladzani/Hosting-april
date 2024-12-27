public class no2 {
    static int[] methodA(int[] arr) {
        int[] bilangan = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
        bilangan[i] = arr[i] % 2;
        }
        return bilangan;
    }

        public static void main(String[] args) {
        int[] bilangan = { 5, 3, 2, 1, 6, 2 };
        int[] bilangan2 = methodA(bilangan);
        for (int i : bilangan2) {
        System.out.print(i + "  ");
        }

    }
}
