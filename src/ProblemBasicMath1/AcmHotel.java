package ProblemBasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class AcmHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(stk.nextToken());
            int W = Integer.parseInt(stk.nextToken());
            int N = Integer.parseInt(stk.nextToken());
            int floorNum = N % H;
            if (floorNum == 0) {
                floorNum = H;
            }
            int roomNum = (int) Math.ceil((double) N / H);
            String viewZero = roomNum >= 10 ? "" : "0";
            bw.write(floorNum + viewZero + roomNum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
