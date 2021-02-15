package ProblemBasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class FindPrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int primeCount = 0;

        one:
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stk.nextToken());
            if (num == 1) {
                continue;
            } else if (num == 2) {
                primeCount++;
                continue;
            }
            for (int j = 2; j < num / 2 + 1; j++) {
                if (num % j == 0) {
                    continue one;
                }
            }
            primeCount++;
        }
        br.close();
        bw.write(String.valueOf(primeCount));
        bw.flush();
        bw.close();
    }
}
