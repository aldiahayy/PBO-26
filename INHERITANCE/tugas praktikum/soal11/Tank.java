package praktikum5;
public class Tank extends Karakter {
    public Tank(String nama, String role) {
        super(nama, role);
    }

    @Override
    public void attack() {
        System.out.println(nama + " menyerang dengan tameng besar");
    }
}
