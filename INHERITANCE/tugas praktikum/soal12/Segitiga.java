package praktikum5;
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Overriding
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
