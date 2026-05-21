package praktikum3.soal08_09;
import praktikum3.soal07.Super03BangunRuang;
public class Sub03Kubus extends Super03BangunRuang {
    private double sisi;

    public Sub03Kubus() {
    }

    public Sub03Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Sub03Kubus(String nama, double sisi) {
        this.nama = nama;
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double hitungVolume(double s) {
        return s * s * s;
    }

    @Override
    public void info() {
        System.out.println("Ini adalah Kubus dengan sisi = " + sisi);
    }
}
