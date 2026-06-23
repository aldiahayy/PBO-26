package praktikum5;
public class PersegiPanjang extends BangunDatar{
    protected double panjang;
    protected double lebar;

    public PersegiPanjang (double panjang, double lebar){
        super("persegi panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}
