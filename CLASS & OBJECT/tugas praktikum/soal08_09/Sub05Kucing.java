package praktikum3.soal08_09;
import praktikum3.soal07.Super05Hewan;
public class Sub05Kucing extends Super05Hewan {
    private int umur;

    public Sub05Kucing() {
    }

    public Sub05Kucing(int umur) {
        this.umur = umur;
    }

    public Sub05Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void infoKucing() {
        System.out.println("Kucing berumur " + umur + " tahun");
    }

    public void infoKucing(String warna) {
        System.out.println("Kucing warna " + warna + " berumur " + umur + " tahun");
    }

    @Override
    public void makan() {
        System.out.println("Kucing makan ikan");
    }
}
