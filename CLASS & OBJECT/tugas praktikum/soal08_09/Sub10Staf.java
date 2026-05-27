package praktikum3.soal08_09;
import praktikum3.soal07.Super10Pegawai;
public class Sub10Staf extends Super10Pegawai {
    private double gaji;

    public Sub10Staf() {
    }

    public Sub10Staf(double gaji) {
        this.gaji = gaji;
    }

    public Sub10Staf(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void infoPegawai() {
        System.out.println("Staff dengan gaji " + gaji);
    }

    public void infoPegawai(String bagian) {
        System.out.println("Staff bagian " + bagian + " dengan gaji " + gaji);
    }

    @Override
    public void bekerja() {
        System.out.println("Staff menjalankan tugas");
    }
}
