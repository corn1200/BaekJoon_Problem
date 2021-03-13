package Sort;

import java.io.*;
import java.util.TreeMap;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double total = 0;
        int modeMinSecond = 0;
        int modeMax = 0;
        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];
        int[] countArr = new int[8001];
        int[] countArrClone;
        int[] outputArr = new int[N];
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
            total += inputArr[i];
            countArr[inputArr[i] + 4000]++;
        }

        countArrClone = countArr.clone();

        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = inputArr.length - 1; i >= 0; i--) {
            outputArr[countArr[inputArr[i] + 4000] - 1] = inputArr[i];
            countArr[inputArr[i] + 4000]--;
        }

        for (int i = 0; i < countArrClone.length; i++) {
            if (countArrClone[i] > modeMax) {
                modeMax = countArrClone[i];
            }
        }

        int stack = 0;
        for (int i = 0; i < outputArr.length; i++) {
            if (stack >= 2) {
                break;
            } else if (countArrClone[outputArr[i] + 4000] == modeMax &&
                    outputArr[i] != modeMinSecond) {
                modeMinSecond = outputArr[i];
                stack++;
            }
        }

        bw.write(String.format("%.0f", total / N) + "\n");
        bw.write(outputArr[N / 2] + "\n");
        bw.write(modeMinSecond + "\n");
        bw.write(outputArr[outputArr.length - 1] - outputArr[0] + "\n");
        bw.flush();
        bw.close();
    }
}
