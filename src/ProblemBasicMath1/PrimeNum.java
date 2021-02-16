package ProblemBasicMath1;

import java.io.*;

public class PrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int primeTotal = 0;
        int firstPrime = 0;

        if (M % 2 == 0) {
            M++;
        }
        if (N % 2 == 0) {
            N--;
        }
        for (int i = M; i <= N; i++) {
            if (firstPrime == 0 && sumPrime(i) > 0) {
                firstPrime = i;
            }
            primeTotal += sumPrime(i);
            bw.write(String.valueOf(sumPrime(i)));
        }
        if (primeTotal <= 0) {
            bw.write(-1 + "\n");
        } else {
            bw.write(primeTotal + "\n");
            bw.write(String.valueOf(firstPrime));
        }
        bw.flush();
        bw.close();
    }

    public static int sumPrime(int num) {
        if (num == 1) {
            return 0;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return 0;
                }
            }
            return num;
        }
    }
}
