package Sort;

import java.io.*;

public class SortNumbers3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] countArr = new int[10001];
        int[] outputArr = new int[N];

        for (int i = 0; i < N; i++) {
            countArr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            countArr[1] += countArr[i - 1];
        }

        bw.flush();
        bw.close();
    }
}
