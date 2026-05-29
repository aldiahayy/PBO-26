package praktikum3.soal10;
import praktikum3.soal08_09.*;
public class Main {
    public static void main(String[] args) {
        // 01. AlatMusik
        Sub01Gitar gitar = new Sub01Gitar("Gitar", 6);
        Sub01Piano piano = new Sub01Piano("Piano", 88);

        gitar.bunyi();
        gitar.infoGitar();

        piano.bunyi();
        piano.infoPiano();

        // 02. BangunDatar
        Sub02Persegi p = new Sub02Persegi("Persegi", 4);
        Sub02PersegiPanjang pp = new Sub02PersegiPanjang("Persegi Panjang", 6, 3);

        p.info();
        System.out.println("Luas: " + p.hitungLuas());

        pp.info();
        System.out.println("Luas: " + pp.hitungLuas());

        // 03. BangunRuang
        Sub03Kubus kubus = new Sub03Kubus("Kubus", 5);
        Sub03Balok balok = new Sub03Balok("Balok", 4, 3, 2);

        kubus.info();
        System.out.println("Volume: " + kubus.hitungVolume());

        balok.info();
        System.out.println("Volume: " + balok.hitungVolume());

        // 04. Elektronik
        Sub04Laptop laptop = new Sub04Laptop("Laptop", 8);
        Sub04Smartphone hp = new Sub04Smartphone("Smartphone", 5000);

        laptop.nyala();
        laptop.infoLaptop();

        hp.nyala();
        hp.infoSmartphone();

        // 05. Hewan
        Sub05Kucing kucing = new Sub05Kucing("Kucing", 2);
        Sub05Ikan ikan = new Sub05Ikan("Ikan", "Tawar");

        kucing.makan();
        kucing.infoKucing();

        ikan.makan();
        ikan.infoIkan();


        // 06. Kendaraan
        Sub06Mobil mobil = new Sub06Mobil("Mobil", 120);
        Sub06Motor motor = new Sub06Motor("Motor", 100);

        mobil.jalan();
        mobil.infoMobil();

        motor.jalan();
        motor.infoMotor();

        // 07. Mahasiswa
        Sub07MahasiswaTI mti = new Sub07MahasiswaTI("Andi", "Informatika");
        Sub07MahasiswaHukum mh = new Sub07MahasiswaHukum("Budi", "Pidana");

        mti.belajar();
        mti.infoMahasiswa();

        mh.belajar();
        mh.infoMahasiswa();

        // 08. Makanan
        Sub08NasiGoreng nasi = new Sub08NasiGoreng("Nasi Goreng", 3);
        Sub08MieAyam mie = new Sub08MieAyam("Mie Ayam", "Besar");

        nasi.dimakan();
        nasi.infoMakanan();

        mie.dimakan();
        mie.infoMakanan();

        // 09. Pakaian
        Sub09Baju baju = new Sub09Baju("Baju", "L");
        Sub09Celana celana = new Sub09Celana("Celana", "M");

        baju.dipakai();
        baju.infoBaju();

        celana.dipakai();
        celana.infoCelana();

        // 10. Pegawai
        Sub10Manager manager = new Sub10Manager("Manager", 10000000);
        Sub10Staf staf = new Sub10Staf("Staf", 5000000);

        manager.bekerja();
        manager.infoPegawai();

        staf.bekerja();
        staf.infoPegawai();
    }
}
