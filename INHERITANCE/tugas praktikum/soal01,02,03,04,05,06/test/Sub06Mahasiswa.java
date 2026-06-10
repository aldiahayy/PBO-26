package praktikum5.test;
import praktikum5.paket6.Manusia;
import praktikum5.paketinterface.MyInterface;
public class Sub06Mahasiswa extends Manusia implements MyInterface {
    @Override
    public void kerja() {
        System.out.println("Mahasiswa belajar");
    }

    @Override
    public String getStringInfoState() {
        return "Mahasiswa aktif";
    }
}
