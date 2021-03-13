package Sort;

import java.io.*;

public class SortNumbers3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];
        int[] countArr = new int[10001];
        int[] outputArr = new int[N];

        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
            countArr[inputArr[i]]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = N - 1; i >= 0; i--) {
            outputArr[countArr[inputArr[i]] - 1] = inputArr[i];
            countArr[inputArr[i]]--;
        }

        for (int i = 0; i < outputArr.length; i++) {
            bw.write(outputArr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
