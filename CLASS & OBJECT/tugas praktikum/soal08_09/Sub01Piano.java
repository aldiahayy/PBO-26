package praktikum3.soal08_09;
import praktikum3.soal07.Super01AlatMusik;
public class Sub01Piano extends Super01AlatMusik {
    private int jumlahTuts;

    public Sub01Piano() {
    }

    public Sub01Piano(int jumlahTuts) {
        this.jumlahTuts = jumlahTuts;
    }

    public Sub01Piano(String nama, int jumlahTuts) {
        this.nama = nama;
        this.jumlahTuts = jumlahTuts;
    }

    public void setJumlahTuts(int jumlahTuts) {
        this.jumlahTuts = jumlahTuts;
    }

    public int getJumlahTuts() {
        return jumlahTuts;
    }

    public void infoPiano() {
        System.out.println("Piano memiliki " + jumlahTuts + " tuts");
    }

    public void infoPiano(String tipe) {
        System.out.println("Piano tipe " + tipe + " dengan " + jumlahTuts + " tuts");
    }

    @Override
    public void bunyi() {
        System.out.println("Piano ditekan");
    }
}
