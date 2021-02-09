package ProblemBasicMath1;

import java.io.*;

public class Honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        bw.write(String.valueOf(passHexagonRoom(N)));
        bw.flush();
        bw.close();
    }

    public static int passHexagonRoom(int N) {
        int over = 1;
        if (N == 1) {
            return 1;
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int stack = i * 6;
            if (stack + over >= N) {
                return i + 1;
            }
            over += stack;
        }
        return 0;
    }
}
