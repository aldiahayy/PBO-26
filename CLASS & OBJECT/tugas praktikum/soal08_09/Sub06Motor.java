package praktikum3.soal08_09;
import praktikum3.soal07.Super06Kendaraan;
public class Sub06Motor extends Super06Kendaraan {
    private int kecepatan;

    public Sub06Motor() {
    }

    public Sub06Motor(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public Sub06Motor(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void infoMotor() {
        System.out.println("Motor dengan kecepatan " + kecepatan + " km/jam");
    }

    public void infoMotor(String jenis) {
        System.out.println("Motor jenis " + jenis + " dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    public void jalan() {
        System.out.println("Motor melaju di jalan");
    }
}
