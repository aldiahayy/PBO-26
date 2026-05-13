package praktikum3.soal05;
public class Kotak {
    String warna;
    double panjang;
    double lebar;
    double keliling;
    double luas;

    public Kotak() {
    }

    public Kotak(String w) {
        warna = w;
    }

    public Kotak(String w, double p, double l) {
        warna = w;
        panjang = p;
        lebar = l;
    }

    public void setWarna(String w) {
        warna = w;
    }

    public void setPanjang(double p) {
        panjang = p;
    }

    public void setLebar(double l) {
        lebar = l;
    }

    public double getKeliling() {
        keliling = panjang + lebar + panjang + lebar;
        return keliling;
    }

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }
}
