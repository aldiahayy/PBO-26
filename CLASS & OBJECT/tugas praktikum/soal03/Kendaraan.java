package praktikum3.soal03;
class Kendaraan {
    // Inner Class 1
    class Mobil {
        String merk = "Toyota";

        public void tampilMobil() {
            System.out.println("Ini adalah mobil merk " + merk);
        }
    }

    // Inner Class 2
    class Motor {
        String jenis = "Sport";

        public void tampilMotor() {
            System.out.println("Ini adalah motor jenis " + jenis);
        }
    }

    // Inner Class 3
    class Sepeda {
        int jumlahRoda = 2;

        public void tampilSepeda() {
            System.out.println("Sepeda memiliki " + jumlahRoda + " roda");
        }
    }
}
