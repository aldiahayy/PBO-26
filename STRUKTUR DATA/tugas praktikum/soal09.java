package praktikum2;
import java.util.HashMap;
public class soal09 {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("D0224043","Aldi Salam");
        mahasiswa.put("D0224341","Jumrah");
        mahasiswa.put("D0224008","Dzaky Surya Darma");

        for (String nim : mahasiswa.keySet()){
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + mahasiswa.get(nim));
            System.out.println();
        }
        System.out.println(mahasiswa.get("D0224043"));
    }
}
