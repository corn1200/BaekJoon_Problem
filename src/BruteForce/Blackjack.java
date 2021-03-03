package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Blackjack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        StringTokenizer cardStk = new StringTokenizer(br.readLine());
        br.close();
        int[] cardArr = new int[N];
        for (int i = 0; i < cardArr.length; i++) {
            cardArr[i] = Integer.parseInt(cardStk.nextToken());
        }

        for (int i = 0; i < cardArr.length; i++) {
            int num = cardArr[i];
            for (int j = i + 1; j < cardArr.length; j++) {
                if (num + cardArr[j] >= M) {
                    continue;
                }
                num = cardArr[i] + cardArr[j];
                for (int k = j + 1; k < cardArr.length; k++) {
                    if (num + cardArr[k] <= M && num + cardArr[k] > max) {
                        max = num + cardArr[k];
                    }
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
