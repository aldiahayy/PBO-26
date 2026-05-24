package praktikum3.soal08_09;
import praktikum3.soal07.Super08Makanan;
public class Sub08NasiGoreng extends Super08Makanan {
    private int levelPedas;

    public Sub08NasiGoreng() {
    }

    public Sub08NasiGoreng(int levelPedas) {
        this.levelPedas = levelPedas;
    }

    public Sub08NasiGoreng(String nama, int levelPedas) {
        this.nama = nama;
        this.levelPedas = levelPedas;
    }

    public void setLevelPedas(int levelPedas) {
        this.levelPedas = levelPedas;
    }

    public int getLevelPedas() {
        return levelPedas;
    }

    public void infoMakanan() {
        System.out.println("Nasi goreng dengan level pedas " + levelPedas);
    }

    public void infoMakanan(String topping) {
        System.out.println("Nasi goreng topping " + topping + " dengan level pedas " + levelPedas);
    }

    @Override
    public void dimakan() {
        System.out.println("Nasi goreng dimakan dengan lahap");
    }
}
