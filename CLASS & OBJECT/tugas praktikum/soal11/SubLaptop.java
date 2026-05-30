package praktikum3.soal11;
public class SubLaptop extends SuperElektronik {
    public SubLaptop(String nama) {
        this.nama = nama;
    }

    public void nyalakanLaptop() {
        System.out.println(nama + " dinyalakan sebagai Laptop");
    }
}
