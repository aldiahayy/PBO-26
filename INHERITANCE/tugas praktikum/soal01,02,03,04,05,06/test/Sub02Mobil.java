package praktikum5.test;
import praktikum5.paket2.Kendaraan;
import praktikum5.paketinterface.MyInterface;
public class Sub02Mobil extends Kendaraan implements MyInterface {
    @Override
    public String getStringInfoState() {
        return "Mobil berjalan";
    }
}
