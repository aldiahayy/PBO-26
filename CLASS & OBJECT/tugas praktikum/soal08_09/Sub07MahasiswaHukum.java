package praktikum3.soal08_09;
import praktikum3.soal07.Super07Mahasiswa;
public class Sub07MahasiswaHukum extends Super07Mahasiswa {
    private String bidang;

    public Sub07MahasiswaHukum() {
    }

    public Sub07MahasiswaHukum(String bidang) {
        this.bidang = bidang;
    }

    public Sub07MahasiswaHukum(String nama, String bidang) {
        this.nama = nama;
        this.bidang = bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void infoMahasiswa() {
        System.out.println("Mahasiswa bidang " + bidang);
    }

    public void infoMahasiswa(int semester) {
        System.out.println("Mahasiswa bidang " + bidang + " semester " + semester);
    }

    @Override
    public void belajar() {
        System.out.println("Mahasiswa Hukum belajar hukum");
    }
}
