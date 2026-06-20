package praktikum5;
public class Jungle extends Karakter {
    public Jungle(String nama, String role) {
        super(nama, role);
    }

    @Override
    public void attack() {
        System.out.println(nama + " menyerang dari hutan");
    }
}
