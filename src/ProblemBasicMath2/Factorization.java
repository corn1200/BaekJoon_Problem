package ProblemBasicMath2;

import java.io.*;

public class Factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 2; i <= N && N != 1; i++) {
            if (N % i == 0) {
                N = N / i;
                bw.write(i + "\n");
                i = 1;
            }
        }
        bw.flush();
        bw.close();
    }
}
