package praktikum1;
import java.util.Scanner;
public class soal11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b + 1;
        for (int i = c; i < a; i++) {
            System.out.print(i);
            if (i<(a-1))
            System.out.print(",");
        }
    }
}
