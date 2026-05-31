package praktikum3.soal12;
public class ImageProcessing {
    private int[][][] rgb;

    public ImageProcessing(int[][][] rgb) {
        this.rgb = rgb;
    }

    public int[][][] getRgb() {
        return rgb;
    }

    public void setRgb(int[][][] rgb) {
        this.rgb = rgb;
    }

    // Method konversi ke grayscale
    public int[][] imgToGray() {
        int tinggi = rgb.length;
        int lebar = rgb[0].length;

        int[][] gray = new int[tinggi][lebar];

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < lebar; j++) {

                int r = rgb[i][j][0];
                int g = rgb[i][j][1];
                int b = rgb[i][j][2];

                gray[i][j] = (r + g + b) / 3;
            }
        }

        return gray;
    }

    // toString (menampilkan RGB)
    @Override
    public String toString() {
        String hasil = "Data RGB:\n";

        for (int i = 0; i < rgb.length; i++) {
            for (int j = 0; j < rgb[i].length; j++) {
                hasil += "[" + rgb[i][j][0] + ","
                        + rgb[i][j][1] + ","
                        + rgb[i][j][2] + "] ";
            }
            hasil += "\n";
        }

        return hasil;
    }
}
