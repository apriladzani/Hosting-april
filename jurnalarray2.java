
import java.util.Arrays;

public class jurnalarray2 {
    static int [] tambahElement (int[] array, int elemenBaru){
        int[] arrayNew = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[array.length] = elemenBaru;
        return arrayNew;
    }
    public static void main(String[] args) {
        int [] angka = {1,2,3};
        angka = tambahElement(angka, 4);
        System.out.println(Arrays.toString(angka));
    }
}
