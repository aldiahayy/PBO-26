package praktikum5.test;
import praktikum5.paket1.Hewan;
import praktikum5.paketinterface.MyInterface;
public class Sub01Kucing extends Hewan implements MyInterface {
    @Override
    public String getStringInfoState() {
        return "Kucing aktif";
    }
}
