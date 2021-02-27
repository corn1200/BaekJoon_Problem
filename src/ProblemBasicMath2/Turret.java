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
            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if ((x1 - x2) * (x1 - x2) == (r1 + r2) * (r1 + r2) &&
                    ((y1 == 0 && y2 == 0) || (y1 - y2) * (y1 - y2) >=
                    (r1 + r2) * (r1 + r2)) || (y1 - y2) * (y1 - y2) ==
                    (r1 + r2) * (r1 + r2) && ((x1 == 0 && x2 == 0) ||
                    (x1 - x2) * (x1 - x2) >= (r1 + r2) * (r1 + r2))) {
                bw.write(1 + "\n");
            } else if ((x1 - x2) * (x1 - x2) <= (r1 + r2) * (r1 + r2) &&
                    (y1 - y2) * (y1 - y2) <= (r1 + r2) * (r1 + r2)) {
                bw.write(2 + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
