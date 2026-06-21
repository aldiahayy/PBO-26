package praktikum5;
public class Marksman extends Karakter {
    public Marksman(String nama, String role) {
        super(nama, role);
    }

    @Override
    public void attack() {
        System.out.println(nama + " menyerang dengan panah");
    }
}
