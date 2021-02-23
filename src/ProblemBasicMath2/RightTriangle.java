package ProblemBasicMath2;

import java.io.*;
import java.util.StringTokenizer;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer stk = new StringTokenizer(input);
            int sideOne = Integer.parseInt(stk.nextToken());
            int sideTwo = Integer.parseInt(stk.nextToken());
            int sideThree = Integer.parseInt(stk.nextToken());
            if (sideOne == 0 && sideTwo == 0 && sideThree == 0) {
                break;
            } else if (sideOne > sideTwo && sideOne > sideThree) {
                bw.write((sideOne * sideOne == (sideTwo * sideTwo) +
                        (sideThree * sideThree) ? "right" : "wrong") + "\n");
            } else if (sideTwo > sideOne && sideTwo > sideThree) {
                bw.write((sideTwo * sideTwo == (sideOne * sideOne) +
                        (sideThree * sideThree) ? "right" : "wrong") + "\n");
            } else {
                bw.write((sideThree * sideThree == (sideTwo * sideTwo) +
                        (sideOne * sideOne) ? "right" : "wrong") + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
