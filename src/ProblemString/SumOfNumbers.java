package ProblemString;

import java.io.*;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String numString = br.readLine();
        char[] numCharArr = numString.toCharArray();
        br.close();

        bw.write(String.valueOf(charArrToInt(numCharArr)));
        bw.flush();
        bw.close();
    }

    public static int charArrToInt(char[] charArr) {
        int numSum = 0;
        for (char num : charArr) {
            numSum += Character.getNumericValue(num);
        }

        return numSum;
    }
}
