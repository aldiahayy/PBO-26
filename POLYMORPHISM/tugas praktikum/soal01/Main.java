package praktikum6.soal01;
public class Main {
    public static void main(String[] args) {
        OverloadingClass oc = new OverloadingClass();

        // 1
        oc.tampil();
        oc.tampil("Aldi");

        // 2
        oc.hitung(2, 3);
        oc.hitung(2.5, 3.5);

        // 3
        oc.cetak(10);
        oc.cetak("Hello");

        // 4
        oc.luas(4);
        oc.luas(4, 5);

        // 5
        oc.salam();
        oc.salam("Andi");

        // 6
        oc.volume(3);
        oc.volume(2, 3, 4);

        // 7
        oc.warna("Merah");
        oc.warna("Merah", "Biru");

        // 8
        oc.data(123);
        oc.data("Budi", 123);

        // 9
        oc.login("admin");
        oc.login("admin", "123");

        // 10
        oc.nilai(90);
        oc.nilai(95.5);
    }
}
