package Sort;

import java.io.*;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] N = br.readLine().toCharArray();
        int[] countArr = new int[10];
        char[] outputArr = new char[N.length];

        for (int i = 0; i < N.length; i++) {
            countArr[Integer.parseInt(String.valueOf(N[i]))]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = N.length - 1; i >= 0; i--) {
            outputArr[countArr[Integer.parseInt(String.valueOf(N[i]))] - 1] = N[i];
            countArr[Integer.parseInt(String.valueOf(N[i]))]--;
        }

        bw.write(new StringBuffer(new String(outputArr)).reverse().toString());
        bw.flush();
        bw.close();
    }
}
