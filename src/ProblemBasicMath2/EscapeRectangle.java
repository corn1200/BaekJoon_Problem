package ProblemBasicMath2;

import java.io.*;
import java.util.StringTokenizer;

public class EscapeRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());
        int w = Integer.parseInt(stk.nextToken());
        int h = Integer.parseInt(stk.nextToken());

        if (w - x < x) {
            if (y < w - x && y < h - y) {
                bw.write(String.valueOf(y));
            } else if (h - y < w - x && h - y < y) {
                bw.write(String.valueOf(h - y));
            } else {
                bw.write(String.valueOf(w - x));
            }
        } else {
            if (y < x && y < h - y) {
                bw.write(String.valueOf(y));
            } else if (h - y < x && h - y < y) {
                bw.write(String.valueOf(h - y));
            } else {
                bw.write(String.valueOf(x));
            }
        }

        bw.flush();
        bw.close();
    }
}