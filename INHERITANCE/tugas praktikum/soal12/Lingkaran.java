package praktikum5;
public class Lingkaran extends BangunDatar {
    private double jariJari;
    private final double PI = 3.14;

    // Constructor
    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    // Overriding
    @Override
    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }
}
