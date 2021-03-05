package BruteForce;

import java.io.*;

public class Decomposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;
        int N = Integer.parseInt(br.readLine());
        br.close();
        int numLength = String.valueOf(N).length();

        for (int i = N - (9 * numLength + 1) < 0 ? 0 : N - (9 * numLength + 1); i < N; i++) {
            char[] numArr = String.valueOf(i).toCharArray();
            int result = i;
            for (int j = 0; j < numArr.length; j++) {
                result += Integer.parseInt(String.valueOf(numArr[j]));
            }
            if (result == N) {
                num = i;
                break;
            }
        }
        bw.write(String.valueOf(num == 0 ? 0 : num));
        bw.flush();
        bw.close();
    }
}