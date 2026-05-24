package praktikum3.soal08_09;
import praktikum3.soal07.Super09Pakaian;
public class Sub09Baju extends Super09Pakaian {
    private String ukuran;

    public Sub09Baju() {
    }

    public Sub09Baju(String ukuran) {
        this.ukuran = ukuran;
    }

    public Sub09Baju(String nama, String ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void infoBaju() {
        System.out.println("Baju ukuran " + ukuran);
    }

    public void infoBaju(String warna) {
        System.out.println("Baju warna " + warna + " ukuran " + ukuran);
    }

    @Override
    public void dipakai() {
        System.out.println("Baju dipakai dengan rapi");
    }
}
