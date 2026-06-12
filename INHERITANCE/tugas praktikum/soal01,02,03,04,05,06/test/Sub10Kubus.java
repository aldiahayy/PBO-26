package praktikum5.test;
import praktikum5.paket10.BangunRuang;
import praktikum5.paketinterface.MyInterface;
public class Sub10Kubus extends BangunRuang implements MyInterface {
    @Override
    public double hitungVolume() {
        return 125;
    }

    @Override
    public String getStringInfoState() {
        return "Kubus memiliki volume";
    }
}
