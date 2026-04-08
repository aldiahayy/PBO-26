package praktikum2;
public class soal02 {
    public static void main(String[] args) {
        double [] data = {
                91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
                27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
                53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
        };

        double min = data[0];
        double max = data[0];
        double sum = 0;

        System.out.println("Array 1D : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " | ");
            sum += data[i];
                if (data[i] < min) min = data[i];
                if (data[i] > max) max = data[i];
            }

        System.out.println("\nNilai MIN : " + min);
        System.out.println("Nilai Max : " + max);
        System.out.println("Total     : " + sum);
        System.out.println("Rata-rata : " + sum/data.length);
    }
}
