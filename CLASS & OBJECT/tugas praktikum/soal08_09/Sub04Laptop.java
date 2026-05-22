package praktikum3.soal08_09;
import praktikum3.soal07.Super04Elektronik;
public class Sub04Laptop extends Super04Elektronik {
    private int ram;

    public Sub04Laptop() {
    }

    public Sub04Laptop(int ram) {
        this.ram = ram;
    }

    public Sub04Laptop(String nama, int ram) {
        this.nama = nama;
        this.ram = ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void infoLaptop() {
        System.out.println("Laptop dengan RAM " + ram + " GB");
    }

    public void infoLaptop(String merk) {
        System.out.println("Laptop merk " + merk + " dengan RAM " + ram + " GB");
    }

    @Override
    public void nyala() {
        System.out.println("Laptop dinyalakan");
    }
}
