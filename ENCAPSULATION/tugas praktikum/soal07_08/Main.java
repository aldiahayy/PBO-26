package praktikum4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DetectorTemp tmp = new DetectorTemp();

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\nMasukkan pilihan:");
            System.out.println("1. Baca Suhu");
            System.out.println("2. Input Suhu");
            System.out.println("3. Selesai");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("suhu sekarang : "+ tmp.getSuhu());
                    break;
                case 2:
                    System.out.print("Masukkan suhu: ");
                    double suhu = sc.nextDouble();
                    tmp.setSuhu(suhu);
                    break;
                case 3:
                    System.out.println("anda keluar");
                    break;
                default:
                    System.out.println("pilihan tidak ada");
            }

        }while (pilihan != 3);
        
    }
}
