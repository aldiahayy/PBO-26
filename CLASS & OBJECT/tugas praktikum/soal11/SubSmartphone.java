package praktikum3.soal11;
public class SubSmartphone extends SuperElektronik {
    public SubSmartphone(String nama) {
        this.nama = nama;
    }

    public void nyalakanSmartphone() {
        System.out.println(nama + " dinyalakan sebagai Smartphone");
    }
}
