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
        int minWrongChess = Integer.MAX_VALUE;
        char[][] chessArr = new char[N][M];
        char[][] rightChessBoard1 = {
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};
        char[][] rightChessBoard2 = {
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

        for (int i = 0; i < chessArr.length; i++) {
            chessArr[i] = br.readLine().toCharArray();
        }
        br.close();

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int wrongChess1 = 0;
                int wrongChess2 = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (chessArr[k][l] != rightChessBoard1[k - i][l - j]) {
                            wrongChess1++;
                        }
                        if (chessArr[k][l] != rightChessBoard2[k - i][l - j]) {
                            wrongChess2++;
                        }
                    }
                }
                if (wrongChess1 < minWrongChess) {
                    minWrongChess = wrongChess1;
                }
                if (wrongChess2 < minWrongChess) {
                    minWrongChess = wrongChess2;
                }
            }
        }
        bw.write(String.valueOf(minWrongChess));
        bw.flush();
        bw.close();
    }
}