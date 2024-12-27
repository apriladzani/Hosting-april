public class no1 {
    static int[] bilangan = {5,3,2,1,6,2};
    
        static int methodA(){
            int x = 100;
            for(int i = 0; i < bilangan.length; i++){
                x = x - bilangan[i];
                System.out.println(x);
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println("hasil akhir method : " + methodA());
    }
}
