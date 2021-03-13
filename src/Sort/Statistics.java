package Sort;

import java.io.*;
import java.util.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 0;
        double total = 0;
        int modeMinSecond = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            total += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            queue.add(num);
        }

        for (int i = 0; i < N; i++) {
            int num = queue.poll();
            if (i < N / 2 + 1) {
                median = num;
            }
        }

        bw.write(String.format("%.0f", total / N) + "\n");
        bw.write(median + "\n");
        bw.write(max - min + "\n");
        bw.flush();
        bw.close();
    }
}
