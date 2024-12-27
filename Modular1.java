public class Modular1 {

    public static void greet(){
        System.out.println("\nYang pertama");
        int a = 1;
        if  (a >= 1){
            System.out.println(a);
        }
    }

    public static void gre(){
        System.out.println("\nYang kedua");
        int a = 1;
        if  (a >= 1){
            System.out.println(a);
        }
    }

    public static String getmess() {
        return "\nYang Ketiga pake string";  
    }

    public static int tambah(){
        int a = 1;
        int b = 2;
        int hasil =  a + b;
        return  hasil;  
    }
    
    public static void main(String[] args) {
        greet();
        gre();

        String mess =  getmess();
        System.out.println(mess);

        int pesan  = tambah();
        System.out.println("\n hasil : " +  pesan);

    } 
}