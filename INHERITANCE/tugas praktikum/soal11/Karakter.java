package praktikum5;
public abstract class Karakter {
    protected String nama;
    protected String role;

    // Konstruktor
    public Karakter(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

    // Abstract method
    public abstract void attack();
}
