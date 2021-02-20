package ProblemBasicMath2;

import java.io.*;
import java.util.Arrays;

public class BertrandPost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] primeArr = new boolean[123456 * 2 + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = false;
        primeArr[1] = false;

        String input;
        while ((input = br.readLine()) != null) {
            int primeCount = 0;
            int num = Integer.parseInt(input);
            if (num == 0) {
                break;
            }
            for (long i = 2; i <= num * 2; i++) {
                if (primeArr[(int) i]) {
                    for (long j = i * i; j < primeArr.length; j += i) {
                        primeArr[(int) j] = false;
                    }
                }
            }
            for (int j = num + 1; j <= num * 2; j++) {
                if (primeArr[j]) {
                    primeCount++;
                }
            }
            bw.write(primeCount + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
