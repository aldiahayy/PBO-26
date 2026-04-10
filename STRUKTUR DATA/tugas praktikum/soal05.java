package praktikum2;
import java.util.Stack;
public class soal05 {
    public static void main(String[] args) {
        Stack<Double> data = new Stack<>();
        data.push(91.35);
        data.push(4.72);
        data.push(26.0);
        data.push(3.5);
        data.push(8.0);
        data.push(61.0);
        data.push(65.36);
        data.push(12.0);
        data.push(5.6);
        data.push(7.11);

        data.push(27.0);
        data.push(9.53);
        data.push(549.0);
        data.push(2.23);
        data.push(17.31);
        data.push(4.25);
        data.push(2.13);
        data.push(83.0);
        data.push(7.0);
        data.push(102.4);

        data.push(53.21);
        data.push(3.42);
        data.push(0.21);
        data.push(70.02);
        data.push(819.4);
        data.push(6173.0);
        data.push(4.25);
        data.push(19.8);
        data.push(17.35);
        data.push(5.768);

        System.out.println("Stack : \n" + data);
        double min = data.peek();
        double max = data.peek();
        double sum = 0;

        for (double nilai : data) {
            sum += nilai;
            if (nilai < min) min = nilai;
            if (nilai > max) max = nilai;
        }

        System.out.println("\nNilai MIN : " + min);
        System.out.println("Nilai Max : " + max);
        System.out.println("Total     : " + sum);
        System.out.println("Rata-rata : " + sum/data.size());
    }
}
