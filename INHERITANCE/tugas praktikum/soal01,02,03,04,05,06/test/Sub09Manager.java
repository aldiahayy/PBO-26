package praktikum5.test;
import praktikum5.paket9.Pegawai;
import praktikum5.paketinterface.MyInterface;
public class Sub09Manager extends Pegawai implements MyInterface {
    @Override
    public void bekerja() {
        System.out.println("Manager bekerja");
    }

    @Override
    public String getStringInfoState() {
        return "Manager aktif bekerja";
    }
}
