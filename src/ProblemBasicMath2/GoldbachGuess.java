package ProblemBasicMath2;

import java.io.*;
import java.util.Arrays;

public class GoldbachGuess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = 0;
        int T = Integer.parseInt(br.readLine());
        int[] numArr = new int[T];
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            numArr[i] = n;
            if (maxNum < n) {
                maxNum = n;
            }
        }
        br.close();

        boolean[] primeArr = new boolean[maxNum - 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = false;
        primeArr[1] = false;

        for (long i = 2; i < primeArr.length; i++) {
            if (primeArr[(int) i]) {
                for (long j = i * i; j < primeArr.length; j += i) {
                    primeArr[(int) j] = false;
                }
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            for (int j = numArr[i] / 2; j >= 2; j--) {
                if (primeArr[j] && primeArr[numArr[i] - j]) {
                    bw.write(j + " " + (numArr[i] - j) + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
