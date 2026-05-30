package praktikum3.soal11;
public class Main {
    public static void main(String[] args) {
        SubLaptop laptop = new SubLaptop("Asus");
        SubSmartphone hp = new SubSmartphone("Samsung");
        Gudang gudang = new Gudang();

        laptop.nyalakanLaptop();
        hp.nyalakanSmartphone();

        System.out.println();

        gudang.cekBarang(laptop);
        gudang.cekBarang(hp);
    }
}
