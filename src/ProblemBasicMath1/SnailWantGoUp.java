package ProblemBasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class SnailWantGoUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(stk.nextToken());
        double B = Integer.parseInt(stk.nextToken());
        double V = Integer.parseInt(stk.nextToken()) - A;
        br.close();
        double risePerDay = A - B;
        int riseDayMax = (int) Math.ceil(V / risePerDay);

        bw.write(String.valueOf(riseDayMax + 1));
        bw.flush();
        bw.close();
    }
}
