package praktikum3.soal08_09;
import praktikum3.soal07.Super05Hewan;
public class Sub05Ikan extends Super05Hewan {
    private String jenisAir;

    public Sub05Ikan() {
    }

    public Sub05Ikan(String jenisAir) {
        this.jenisAir = jenisAir;
    }

    public Sub05Ikan(String nama, String jenisAir) {
        this.nama = nama;
        this.jenisAir = jenisAir;
    }

    public void setJenisAir(String jenisAir) {
        this.jenisAir = jenisAir;
    }

    public String getJenisAir() {
        return jenisAir;
    }

    public void infoIkan() {
        System.out.println("Ikan hidup di air " + jenisAir);
    }

    public void infoIkan(String warna) {
        System.out.println("Ikan berwarna " + warna + " hidup di air " + jenisAir);
    }

    @Override
    public void makan() {
        System.out.println("Ikan makan pelet");
    }
}
