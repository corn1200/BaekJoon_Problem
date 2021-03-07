package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Big {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] infoArr = new int[2][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            infoArr[0][i] = x;
            infoArr[1][i] = y;
        }
        br.close();

        for (int i = 0; i < N; i++) {
            int rank = 0;
            for (int j = 0; j < N; j++) {
                if ((infoArr[0][i] < infoArr[0][j] && infoArr[1][i] <= infoArr[1][j]) ||
                        (infoArr[1][i] < infoArr[1][j] && infoArr[0][i] <= infoArr[0][j])) {
                    rank++;
                }
            }
            bw.write(rank + 1 + " ");
        }

        bw.flush();
        bw.close();
    }
}
