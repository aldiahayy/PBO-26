package praktikum3.soal12;
public class Main {
    public static void main(String[] args) {
        // Data dummy RGB (2x2 pixel)
        int[][][] dataRGB = {
                { {255, 0, 0}, {0, 255, 0} },
                { {0, 0, 255}, {255, 255, 0} }
        };

        // Membuat object
        ImageProcessing img = new ImageProcessing(dataRGB);

        //  System.out.println(img.getRgb());
        //  System.out.println(img.getRgb());
        // Menampilkan RGB
        System.out.println(img.toString());

        // Konversi ke grayscale
        int[][] gray = img.imgToGray();

        // Menampilkan hasil grayscale
        System.out.println("Hasil Grayscale:");
        for (int i = 0; i < gray.length; i++) {
            for (int j = 0; j < gray[i].length; j++) {
                System.out.print(gray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
