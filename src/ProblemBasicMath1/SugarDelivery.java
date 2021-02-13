package ProblemBasicMath1;

import java.io.*;

public class SugarDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        if (N % 5 == 0) {
            bw.write(String.valueOf(N / 5));
        } else {
            int fiveKiloBagCount = (int) Math.floor((double) N / 5);
            for (int i = fiveKiloBagCount; i >= 0; i--) {
                int restWeight = N - (5 * i);
                if (restWeight % 3 == 0) {
                    bw.write(String.valueOf(i + (restWeight / 3)));
                    break;
                }
                if (i == 0) {
                    bw.write(String.valueOf(-1));
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
