package ProblemBasicMath1;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FindingPrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        br.close();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 2; i <= N; i++) {
            list.addLast(i);
        }

        while (list.size() > 0) {
            int num = list.removeFirst();
            if (num >= M) {
                bw.write(num + "\n");
            }
            for (int i = 2; i * num <= N; i++) {
                if (list.contains(i * num)) {
                    list.remove(list.indexOf(i * num));
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
