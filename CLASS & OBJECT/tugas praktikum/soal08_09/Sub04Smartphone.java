package praktikum3.soal08_09;
import praktikum3.soal07.Super04Elektronik;
public class Sub04Smartphone extends Super04Elektronik {
    private int baterai;

    public Sub04Smartphone() {
    }

    public Sub04Smartphone(int baterai) {
        this.baterai = baterai;
    }

    public Sub04Smartphone(String nama, int baterai) {
        this.nama = nama;
        this.baterai = baterai;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
    }

    public int getBaterai() {
        return baterai;
    }

    public void infoSmartphone() {
        System.out.println("Smartphone dengan baterai " + baterai + " mAh");
    }

    public void infoSmartphone(String merk) {
        System.out.println("Smartphone merk " + merk + " dengan baterai " + baterai + " mAh");
    }

    @Override
    public void nyala() {
        System.out.println("Smartphone dinyalakan");
    }
}
