import java.util.Arrays;

public class jurnalarray3 {

    public static int [] gabunganArray(int[] array1, int[] array2) {
        int[] arrayGabungan = new int [array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayGabungan[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayGabungan[array2.length + i] = array2[i];
        }
        return arrayGabungan;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] arrayGabungan = gabunganArray (array1, array2 );
        System.out.println(Arrays.toString(arrayGabungan));
    }
}
