package Sort;

import java.io.*;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 0;
        double total = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            total += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 0);
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
        bw.write("");
        bw.write(max - min + "\n");
        bw.flush();
        bw.close();
    }
}
