package praktikum5;
public class Mage extends Karakter {
    public Mage(String nama, String role) {
        super(nama, role);
    }

    @Override
    public void attack() {
        System.out.println(nama + " menyerang dengan sihir");
    }
}
