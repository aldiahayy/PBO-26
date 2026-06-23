package praktikum5;
public class Persegi extends BangunDatar {
    private double sisi;

    // Constructor
    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    // Overriding
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}
