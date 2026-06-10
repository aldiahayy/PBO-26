package praktikum5.test;
import praktikum5.paket5.Pakaian;
import praktikum5.paketinterface.MyInterface;
public class Sub05Baju extends Pakaian implements MyInterface {
    @Override
    public String getStringInfoState() {
        return "Baju sedang dipakai";
    }
}
