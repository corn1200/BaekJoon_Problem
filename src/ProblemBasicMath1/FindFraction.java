package ProblemBasicMath1;

import java.io.*;

public class FindFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int zigzagFloor = 0;
        int X = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= 10000000; i++) {
            X -= i;
            zigzagFloor++;
            if (X <= 0) {
                int absX = Math.abs(X);
                int A;
                int B;
                if (zigzagFloor % 2 != 0) {
                    A = 1;
                    B = zigzagFloor;
                    for (int j = 0; j < absX; j++) {
                        A++;
                        B--;
                    }
                } else {
                    A = zigzagFloor;
                    B = 1;
                    for (int j = 0; j < absX; j++) {
                        A--;
                        B++;
                    }
                }
                bw.write(A+"/"+B);
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
