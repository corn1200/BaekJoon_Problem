package ProblemBasicMath2;

import java.io.*;
import java.util.StringTokenizer;

public class Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken());
            int y1 = Integer.parseInt(stk.nextToken());
            int r1 = Integer.parseInt(stk.nextToken());
            int x2 = Integer.parseInt(stk.nextToken());
            int y2 = Integer.parseInt(stk.nextToken());
            int r2 = Integer.parseInt(stk.nextToken());
//            두 점 사이의 거리
            double d = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
            if (x1 == x2 && y1 == y2) {
                bw.write((r1 == r2 ? -1 : 0) + "\n");
            } else if (r1 + r2 < d || d < Math.abs(r1 - r2)) {
                bw.write(0 + "\n");
            } else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                bw.write(1 + "\n");
            } else if (Math.abs(r1 - r2) < d && d < r1 + r2) {
                bw.write(2 + "\n");
            } else {
                bw.write(-1 + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
