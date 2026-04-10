package praktikum2;
import java.util.LinkedList;
import java.util.Queue;
public class soal06 {
    public static void main(String[] args) {
        Queue<Double> data = new LinkedList<>();
        data.offer(91.35);
        data.offer(4.72);
        data.offer(26.0);
        data.offer(3.5);
        data.offer(8.0);
        data.offer(61.0);
        data.offer(65.36);
        data.offer(12.0);
        data.offer(5.6);
        data.offer(7.11);

        data.offer(27.0);
        data.offer(9.53);
        data.offer(549.0);
        data.offer(2.23);
        data.offer(17.31);
        data.offer(4.25);
        data.offer(2.13);
        data.offer(83.0);
        data.offer(7.0);
        data.offer(102.4);

        data.offer(53.21);
        data.offer(3.42);
        data.offer(0.21);
        data.offer(70.02);
        data.offer(819.4);
        data.offer(6173.0);
        data.offer(4.25);
        data.offer(19.8);
        data.offer(17.35);
        data.offer(5.768);

        System.out.println("Queue : \n" + data);
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
