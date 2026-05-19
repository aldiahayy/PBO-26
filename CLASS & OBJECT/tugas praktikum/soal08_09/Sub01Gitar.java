package praktikum3.soal08_09;
import praktikum3.soal07.Super01AlatMusik;
public class Sub01Gitar extends Super01AlatMusik {
    private int jumlahSenar;

    public Sub01Gitar() {
    }

    public Sub01Gitar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public Sub01Gitar(String nama, int jumlahSenar) {
        this.nama = nama;
        this.jumlahSenar = jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void infoGitar() {
        System.out.println("Gitar memiliki " + jumlahSenar + " senar");
    }

    public void infoGitar(String jenis) {
        System.out.println("Gitar jenis " + jenis + " dengan " + jumlahSenar + " senar");
    }

    @Override
    public void bunyi() {
        System.out.println("Gitar dipetik");
    }
}
