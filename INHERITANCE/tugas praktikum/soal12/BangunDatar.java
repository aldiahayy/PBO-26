package praktikum5;
public abstract class BangunDatar {
    protected String nama;

    // Konstruktor
    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // Abstract method
    public abstract double hitungLuas();

    // Method biasa
    public void info() {
        System.out.println("Nama Bangun Datar: " + nama);
    }
}
