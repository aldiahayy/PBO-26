package praktikum5.test;
import praktikum5.paket7.BangunDatar;
import praktikum5.paketinterface.MyInterface;
public class Sub07Persegi extends BangunDatar implements MyInterface {
    @Override
    public double hitungLuas() {
        return 16;
    }

    @Override
    public String getStringInfoState() {
        return "Persegi memiliki luas";
    }
}
