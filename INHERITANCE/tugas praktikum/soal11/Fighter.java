package praktikum5;
public class Fighter extends Karakter {
    public Fighter(String nama, String role) {
        super(nama, role);
    }

    @Override
    public void attack() {
        System.out.println(nama + " menyerang dengan pedang");
    }
}
