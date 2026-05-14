package praktikum3.soal06;
import java.util.Scanner;
public class soal06 {
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        Main obj = new Main();

        System.out.println("Deret Fibonacci sampai ke-" + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }

    }
}
