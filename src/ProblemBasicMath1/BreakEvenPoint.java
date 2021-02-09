package ProblemBasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        br.close();
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());

        if (C > B) {
            bw.write(String.valueOf(A / (C - B) + 1));
        } else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        bw.close();
    }
}
