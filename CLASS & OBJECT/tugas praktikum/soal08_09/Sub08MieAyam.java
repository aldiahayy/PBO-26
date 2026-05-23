package praktikum3.soal08_09;
import praktikum3.soal07.Super08Makanan;
public class Sub08MieAyam extends Super08Makanan {
    private String ukuran;

    public Sub08MieAyam() {
    }

    public Sub08MieAyam(String ukuran) {
        this.ukuran = ukuran;
    }

    public Sub08MieAyam(String nama, String ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void infoMakanan() {
        System.out.println("Mie ayam ukuran " + ukuran);
    }

    public void infoMakanan(String topping) {
        System.out.println("Mie ayam topping " + topping + " ukuran " + ukuran);
    }

    @Override
    public void dimakan() {
        System.out.println("Mie ayam dimakan hangat");
    }
}
