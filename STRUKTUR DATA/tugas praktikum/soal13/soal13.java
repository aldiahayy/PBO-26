package praktikum2;
public class soal13 {
    public static void main(String[] args) {
        int[][] graph = {
//               0  1  2  3  4  5  6
//               |  |  |  |  |  |  |
                {0, 12, 0, 8, 0, 0, 5}, //V0
                {0, 0, 16, 0, 0, 5, 0}, //V1
                {0, 0, 0, 0, 4, 0, 0},  //V2
                {0, 3, 0, 0, 0, 0, 0},  //V3
                {0, 6, 0, 0, 0, 2, 0},  //V4
                {16, 0, 0, 0, 0, 0, 0}, //V5
                {0, 0, 0, 0, 0, 7, 0}   //V6
        };

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
