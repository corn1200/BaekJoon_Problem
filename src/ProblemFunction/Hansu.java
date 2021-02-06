package ProblemFunction;

import java.io.*;

public class Hansu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hansuCount;
        int N = Integer.parseInt(br.readLine());
        br.close();

        if (N < 100) {
            hansuCount = N;
        } else {
            hansuCount = 99;
            for (int i = 100; i <= N; i++) {
                int[] isometricSequence = makeIsometricSequence(i);
                if (proveIsometricSequence(isometricSequence)) {
                    hansuCount++;
                }
            }
        }

        bw.write(String.valueOf(hansuCount));
        bw.flush();
        bw.close();
    }

    public static boolean proveIsometricSequence(int[] numArr) {
        int tolerance = numArr[1] - numArr[0];
        int j;
        for (j = 1; j < numArr.length - 1; j++) {
            if (numArr[j] + tolerance
                    != numArr[j + 1]) {
                break;
            }
        }
        if (j == numArr.length - 1) {
            return true;
        }
        return false;
    }

    public static int[] makeIsometricSequence(int num) {
        String numString = String.valueOf(num);
        char[] numCharArr = numString.toCharArray();
        int[] isometricSequence = new int[numCharArr.length];
        for (int j = 0; j < isometricSequence.length; j++) {
            isometricSequence[j] = Integer.parseInt(String.valueOf(numCharArr[j]));
        }
        return isometricSequence;
    }
}