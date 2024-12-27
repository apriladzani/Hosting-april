import java.util.ArrayList;

public class olahNIlai {
    
    public static void main(String[] args) {
        ArrayList<String> nilai = new ArrayList<>();
        nilai.add("Bagus");
        nilai.add("Dzaki");
        nilai.add("Budi");
        nilai.add("Dedi");
        nilai.add("Alvaro");

        for (int i = 0; i < nilai.size(); i++) {
            System.out.println(nilai.get(i));
        }

        nilai.add(2,"Zoro");

        nilai.remove(nilai.size()-1);
        for (int i = 0; i < nilai.size(); i++) {
            System.out.println(nilai.get(i));
        }
    }
}
