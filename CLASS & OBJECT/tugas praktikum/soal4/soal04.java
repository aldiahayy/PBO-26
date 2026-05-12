package praktikum3.soal04;
public class soal04 {
    public static void main(String[] args) {
        // Mengakses static field tanpa object
        System.out.println("Akses langsung: " + Matematika.angka);

        // Memanggil static method tanpa object
        Matematika.tampilAngka();

        int hasil = Matematika.tambah(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
