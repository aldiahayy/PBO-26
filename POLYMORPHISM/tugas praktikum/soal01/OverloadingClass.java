package praktikum6.soal01;
public class OverloadingClass {
    // Method 1
    public void tampil() {
        System.out.println("Method tampil()");
    }

    // Oveloading 1
    public void tampil(String nama) {
        System.out.println("Nama: " + nama);
    }

    // Method 2
    public void hitung(int a, int b) {
        System.out.println("Jumlah: " + (a + b));
    }

    // Oveloading 2
    public void hitung(double a, double b) {
        System.out.println("Jumlah Double: " + (a + b));
    }

    // Method 3
    public void cetak(int angka) {
        System.out.println("Angka: " + angka);
    }

    // Oveloading 3
    public void cetak(String teks) {
        System.out.println("Teks: " + teks);
    }

    // Method 4
    public void luas(int sisi) {
        System.out.println("Luas Persegi: " + (sisi * sisi));
    }

    // Oveloading 4
    public void luas(int p, int l) {
        System.out.println("Luas Persegi Panjang: " + (p * l));
    }

    // Method 5
    public void salam() {
        System.out.println("Halo");
    }

    // Oveloading 5
    public void salam(String nama) {
        System.out.println("Halo " + nama);
    }

    // Method 6
    public void volume(int s) {
        System.out.println("Volume Kubus: " + (s * s * s));
    }

    // Oveloading 6
    public void volume(int p, int l, int t) {
        System.out.println("Volume Balok: " + (p * l * t));
    }

    // Method 7
    public void warna(String warna) {
        System.out.println("Warna: " + warna);
    }

    // Oveloading 7
    public void warna(String warna1, String warna2) {
        System.out.println("Warna: " + warna1 + " dan " + warna2);
    }

    // Method 8
    public void data(int nim) {
        System.out.println("NIM: " + nim);
    }

    // Oveloading 8
    public void data(String nama, int nim) {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }

    // Method 9
    public void login(String user) {
        System.out.println("User: " + user);
    }

    // Oveloading 9
    public void login(String user, String pass) {
        System.out.println("Login berhasil");
    }

    // Method 10
    public void nilai(int n) {
        System.out.println("Nilai: " + n);
    }

    // Oveloading 10
    public void nilai(double n) {
        System.out.println("Nilai Double: " + n);
    }
}
