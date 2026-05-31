package praktikum3.soal13;
import java.util.Scanner;
public class SpaceCraft {
    public int xPos;
    public int yPos;

    public void up() {
        yPos++;
    }

    public void down() {
        yPos--;
    }

    public void left() {
        xPos--;
    }

    public void right() {
        xPos++;
    }
    
    public static void main(String[] args) {
        SpaceCraft s = new SpaceCraft();
        s.xPos = 0;
        s.yPos = 0;
        Scanner sc = new Scanner(System.in);
        int pilih = 1;
        while (pilih != 0) {
            System.out.println("\n1. atas");
            System.out.println("2. bawah");
            System.out.println("3. kiri");
            System.out.println("4. kanan");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    s.up();
                    System.out.println(s.xPos);
                    System.out.println(s.yPos);
                    break;
                case 2:
                    s.down();
                    System.out.println(s.xPos);
                    System.out.println(s.yPos);
                    break;
                case 3:
                    s.left();
                    System.out.println(s.xPos);
                    System.out.println(s.yPos);
                    break;
                case 4:
                    s.right();
                    System.out.println(s.xPos);
                    System.out.println(s.yPos);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }

    }
}
