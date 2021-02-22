package ProblemBasicMath2;

import java.io.*;
import java.util.StringTokenizer;

public class FourthPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] locationX = new int[3];
        int[] locationY = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            locationX[i] = Integer.parseInt(stk.nextToken());
            locationY[i] = Integer.parseInt(stk.nextToken());
        }
        int pointX = locationX[0] == locationX[1] ? locationX[2] : locationX[0] == locationX[2] ? locationX[1] : locationX[0];
        int pointY = locationY[0] == locationY[1] ? locationY[2] : locationY[0] == locationY[2] ? locationY[1] : locationY[0];

        bw.write(pointX + " " + pointY);
        bw.flush();
        bw.close();
    }
}
