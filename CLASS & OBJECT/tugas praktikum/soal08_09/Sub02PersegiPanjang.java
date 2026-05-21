package praktikum3.soal08_09;
import praktikum3.soal07.Super02BangunDatar;
public class Sub02PersegiPanjang extends Super02BangunDatar {
    private double panjang;
    private double lebar;

    public Sub02PersegiPanjang() {
    }

    public Sub02PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Sub02PersegiPanjang(String nama, double panjang, double lebar) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungLuas(double p, double l) {
        return p * l;
    }

    @Override
    public void info() {
        System.out.println("Ini adalah Persegi Panjang: panjang = " + panjang + ", lebar = " + lebar);
    }
}
