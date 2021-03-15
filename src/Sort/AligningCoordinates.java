package Sort;

import java.io.*;
import java.util.StringTokenizer;

public class AligningCoordinates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] location = new int[2][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            location[0][i] = Integer.parseInt(stk.nextToken());
            location[1][i] = Integer.parseInt(stk.nextToken());
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (location[1][j] > location[1][j + 1]) {
                    int temp = location[1][j];
                    location[1][j] = location[1][j + 1];
                    location[1][j + 1] = temp;
                }
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (location[0][j] > location[0][j + 1]) {
                    int temp = location[0][j];
                    location[0][j] = location[0][j + 1];
                    location[0][j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(location[0][i] + " " + location[1][i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
