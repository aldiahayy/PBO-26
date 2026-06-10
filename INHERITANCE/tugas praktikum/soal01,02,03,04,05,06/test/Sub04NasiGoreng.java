package praktikum5.test;
import praktikum5.paket4.Makanan;
import praktikum5.paketinterface.MyInterface;
public class Sub04NasiGoreng extends Makanan implements MyInterface {
    @Override
    public String getStringInfoState() {
        return "Nasi goreng siap dimakan";
    }
}
