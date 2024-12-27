public class array {
    public static void main (String[] args) {
        int[] y = new int[4];
        
        y[0] = 5;
        y[1] = 8;
        y[2] = 9;
        y[3] = 12;

        for (int k = 3; k >= 0; k--) {
            y[k]= y[k] - k;
            System.out.println(y[k]);
        }

    }
}
