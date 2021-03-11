package Sort;

import java.io.*;
import java.util.PriorityQueue;

public class SortNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.add(Integer.valueOf(br.readLine()));
        }
        for (int i = 0; i < N; i++) {
            bw.write(queue.poll() + "\n");
        }
        bw.flush();
        bw.close();
    }
}