package praktikum5.test;
import praktikum5.paket3.Elektronik;
import praktikum5.paketinterface.MyInterface;
public class Sub03Laptop extends Elektronik implements MyInterface {
    @Override
    public String getStringInfoState() {
        return "Laptop menyala";
    }
}
