package ProblemBasicMath1;

import java.io.*;
import java.util.LinkedList;

public class BeWomenChairman {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int residentNum = 0;
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 1; j <= n; j++) {
                list.addLast(j);
            }
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < n; k++) {
                    residentNum += list.removeFirst();
                    list.addLast(residentNum);
                }
                if (j < K - 1) {
                    residentNum = 0;
                }
            }
            bw.write(residentNum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
