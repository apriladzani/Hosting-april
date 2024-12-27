public class array4 {
    public static void main(String[] args) {
        int[] arr = {12, 54, 23, 67, 34, 89, 2};

        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);
    }
}
