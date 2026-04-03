package praktikum2;
public class soal01 {
    public static void main(String[] args) {
        double [][] data = {
                {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
                {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
                {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}

        };

        double min = data[0][0];
        double max = data[0][0];
        double sum = 0;
        int count = 0;
        System.out.println("Array 2D : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " | ");
                sum += data[i][j];
                count++;

                if (data[i][j] < min) min = data[i][j];
                if (data[i][j] > max) max = data[i][j];
            }
            System.out.println();
        }

        System.out.println("\nNilai MIN : " + min);
        System.out.println("Nilai Max : " + max);
        System.out.println("Total     : " + sum);
        System.out.println("Rata-rata : " + sum/count);
        System.out.println(count);
        System.out.println(data.length);
    }
}
