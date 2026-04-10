package praktikum2;
import java.util.HashSet;
public class soal08 {
    public static void main(String[] args) {
        HashSet<String> nim = new HashSet<>();
        nim.add("D0224043");
        nim.add("D0224341");
        nim.add("D0224003");
        nim.add("D0224012");

        System.out.println(nim);
        for (String a : nim){
            System.out.println(a);
        }
    }
}
