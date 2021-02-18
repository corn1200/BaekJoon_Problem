package ProblemBasicMath1;

import java.io.*;
//import java.util.LinkedList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindingPrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        br.close();
        boolean[] primeArr = new boolean[N + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = false;
        primeArr[1] = false;

        for (long i = 2; i < primeArr.length; i++) {
            if (primeArr[(int) i]) {
                if (i >= M) {
                    bw.write(i + "\n");
                }
                for (long j = i * i; j < primeArr.length; j += i) {
                    primeArr[(int) j] = false;
                }
            }
        }
//        LinkedList<Integer> list = new LinkedList<>();
//
//        for (int i = 2; i <= N; i++) {
//            list.addLast(i);
//        }
//
//        while (list.size() > 0) {
//            int num = list.removeFirst();
//            if (num >= M) {
//                bw.write(num + "\n");
//            }
//            for (int i = num * num; i <= N; i += num) {
//                if (list.contains(i)) {
//                    list.remove(list.indexOf(i));
//                }
//            }
//        }
        bw.flush();
        bw.close();
    }
}
