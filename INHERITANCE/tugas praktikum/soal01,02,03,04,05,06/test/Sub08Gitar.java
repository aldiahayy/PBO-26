package praktikum5.test;
import praktikum5.paket8.AlatMusik;
import praktikum5.paketinterface.MyInterface;
public class Sub08Gitar extends AlatMusik implements MyInterface {
    @Override
    public void bunyi() {
        System.out.println("Gitar dipetik");
    }

    @Override
    public String getStringInfoState() {
        return "Gitar berbunyi";
    }
}
