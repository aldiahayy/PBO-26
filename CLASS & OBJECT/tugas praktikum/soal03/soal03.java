package praktikum3.soal03;
public class soal03 {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();

        Kendaraan.Mobil mobil = kendaraan.new Mobil();
        Kendaraan.Motor motor = kendaraan.new Motor();
        Kendaraan.Sepeda sepeda = kendaraan.new Sepeda();

        mobil.tampilMobil();
        motor.tampilMotor();
        sepeda.tampilSepeda();
    }
}
