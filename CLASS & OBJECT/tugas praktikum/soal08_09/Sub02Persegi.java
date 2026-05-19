package praktikum3.soal08_09;
import praktikum3.soal07.Super02BangunDatar;
public class Sub02Persegi extends Super02BangunDatar {
    private double sisi;

    public Sub02Persegi() {
    }

    public Sub02Persegi(double sisi) {
        this.sisi = sisi;
    }

    public Sub02Persegi(String nama, double sisi) {
        this.nama = nama;
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungLuas(double s) {
        return s * s;
    }

    @Override
    public void info() {
        System.out.println("Ini adalah Persegi dengan sisi = " + sisi);
    }
}
