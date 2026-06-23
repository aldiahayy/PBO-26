package praktikum5;
public class Main {
    public static void main(String[] args) {
        // Object Segitiga
        Segitiga segitiga = new Segitiga(10, 5);
        segitiga.info();
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println();

        // Object Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        lingkaran.info();
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println();

        // Object Persegi
        Persegi persegi = new Persegi(4);
        persegi.info();
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println();

        // Object Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(2,4);
        pp.info();
        System.out.println("Luas: " + pp.hitungLuas());
    }
}
