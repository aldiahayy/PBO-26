package praktikum3.soal08_09;
import praktikum3.soal07.Super06Kendaraan;
public class Sub06Mobil extends Super06Kendaraan {
    private int kecepatan;

    public Sub06Mobil() {
    }

    public Sub06Mobil(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public Sub06Mobil(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void infoMobil() {
        System.out.println("Mobil dengan kecepatan " + kecepatan + " km/jam");
    }

    public void infoMobil(String merk) {
        System.out.println("Mobil merk " + merk + " dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    public void jalan() {
        System.out.println("Mobil melaju di jalan");
    }
}
