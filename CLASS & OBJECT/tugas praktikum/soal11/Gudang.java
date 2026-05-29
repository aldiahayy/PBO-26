package praktikum3.soal11;
public class Gudang {
    public void cekBarang(SuperElektronik barang) {
        if (barang instanceof SubLaptop) {
            System.out.println("Barang adalah Laptop");
        }
        else if (barang instanceof SubSmartphone) {
            System.out.println("Barang adalah Smartphone");
        }
        else {
            System.out.println("Barang tidak diketahui");
        }
    }
}
