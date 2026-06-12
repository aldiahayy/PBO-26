package praktikum5.test;
public class Main {
    public static void main(String[] args) {
        // HEWAN
        Sub01Kucing kucing = new Sub01Kucing();

        kucing.makan();
        System.out.println(kucing.getStringInfoState());

        System.out.println();

        // KENDARAAN
        Sub02Mobil mobil = new Sub02Mobil();

        mobil.jalan();
        System.out.println(mobil.getStringInfoState());

        System.out.println();

        // ELEKTRONIK
        Sub03Laptop laptop = new Sub03Laptop();

        laptop.nyala();
        System.out.println(laptop.getStringInfoState());

        System.out.println();

        // MAKANAN
        Sub04NasiGoreng nasi = new Sub04NasiGoreng();

        nasi.dimakan();
        System.out.println(nasi.getStringInfoState());

        System.out.println();

        // PAKAIAN
        Sub05Baju baju = new Sub05Baju();

        baju.dipakai();
        System.out.println(baju.getStringInfoState());

        System.out.println();

        // MANUSIA
        Sub06Mahasiswa mahasiswa = new Sub06Mahasiswa();

        mahasiswa.kerja();
        System.out.println(mahasiswa.getStringInfoState());

        System.out.println();

        // BANGUN DATAR
        Sub07Persegi persegi = new Sub07Persegi();

        System.out.println("Luas Persegi: "
                + persegi.hitungLuas());

        System.out.println(persegi.getStringInfoState());

        System.out.println();

        // ALAT MUSIK
        Sub08Gitar gitar = new Sub08Gitar();

        gitar.bunyi();
        System.out.println(gitar.getStringInfoState());

        System.out.println();

        // PEGAWAI
        Sub09Manager manager = new Sub09Manager();

        manager.bekerja();
        System.out.println(manager.getStringInfoState());

        System.out.println();

        // BANGUN RUANG
        Sub10Kubus kubus = new Sub10Kubus();

        System.out.println("Volume Kubus: "
                + kubus.hitungVolume());

        System.out.println(kubus.getStringInfoState());
    }
}
