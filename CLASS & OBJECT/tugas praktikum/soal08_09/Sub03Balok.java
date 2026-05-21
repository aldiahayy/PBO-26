package praktikum3.soal08_09;
import praktikum3.soal07.Super03BangunRuang;
public class Sub03Balok extends Super03BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Sub03Balok() {
    }

    public Sub03Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public Sub03Balok(String nama, double panjang, double lebar, double tinggi) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungVolume(double p, double l, double t) {
        return p * l * t;
    }

    @Override
    public void info() {
        System.out.println("Ini adalah Balok: panjang = " + panjang + ", lebar = " + lebar + ", tinggi = " + tinggi);
    }
}
