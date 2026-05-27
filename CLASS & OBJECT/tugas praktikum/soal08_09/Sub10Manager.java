package praktikum3.soal08_09;
import praktikum3.soal07.Super10Pegawai;
public class Sub10Manager extends Super10Pegawai {
    private double gaji;

    public Sub10Manager() {
    }

    public Sub10Manager(double gaji) {
        this.gaji = gaji;
    }

    public Sub10Manager(String nama, double gaji) {
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
        System.out.println("Manager dengan gaji " + gaji);
    }

    public void infoPegawai(String divisi) {
        System.out.println("Manager divisi " + divisi + " dengan gaji " + gaji);
    }

    @Override
    public void bekerja() {
        System.out.println("Manager mengatur pekerjaan");
    }
}
