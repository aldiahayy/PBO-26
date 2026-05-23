package praktikum3.soal08_09;
import praktikum3.soal07.Super07Mahasiswa;
public class Sub07MahasiswaTI extends Super07Mahasiswa {
    private String jurusan;

    public Sub07MahasiswaTI() {
    }

    public Sub07MahasiswaTI(String jurusan) {
        this.jurusan = jurusan;
    }

    public Sub07MahasiswaTI(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void infoMahasiswa() {
        System.out.println("Mahasiswa jurusan " + jurusan);
    }

    public void infoMahasiswa(int semester) {
        System.out.println("Mahasiswa jurusan " + jurusan + " semester " + semester);
    }

    @Override
    public void belajar() {
        System.out.println("Mahasiswa TI belajar coding");
    }
}
