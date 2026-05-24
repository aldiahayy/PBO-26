package praktikum3.soal08_09;
import praktikum3.soal07.Super09Pakaian;
public class Sub09Celana extends Super09Pakaian {
    private String ukuran;

    public Sub09Celana() {
    }

    public Sub09Celana(String ukuran) {
        this.ukuran = ukuran;
    }

    public Sub09Celana(String nama, String ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void infoCelana() {
        System.out.println("Celana ukuran " + ukuran);
    }

    public void infoCelana(String warna) {
        System.out.println("Celana warna " + warna + " ukuran " + ukuran);
    }

    @Override
    public void dipakai() {
        System.out.println("Celana dipakai dengan nyaman");
    }
}
