package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class RepaintingChessboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int blackCount = 0;
        int whiteCount = 0;

        for (int i = 0; i < N; i++) {
            char[] chessArr = br.readLine().toCharArray();
            for (int j = 0; j < chessArr.length; j++) {
                if (chessArr[j] == 'B') {
                    blackCount++;
                } else {
                    whiteCount++;
                }
            }
        }

        if (Math.abs(N * M / 2 - blackCount) < Math.abs(N * M / 2 - whiteCount)) {
            bw.write(String.valueOf(Math.abs(N * M / 2 - blackCount)));
        } else {
            bw.write(String.valueOf(Math.abs(N * M / 2 - whiteCount)));
        }

        bw.flush();
        bw.close();
    }
}