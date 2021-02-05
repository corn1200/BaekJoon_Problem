package ProblemOneDimenArray;

import java.io.*;
import java.util.StringTokenizer;

public class AboveAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        double[] avgRatio = new double[C];

        for (int i = 0; i < C; i++) {
            double avgScore;
            double sumScore = 0;
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stk.nextToken());
            double[] stuScoreArray = new double[N];
            for (int j = 0; j < stuScoreArray.length; j++) {
                stuScoreArray[j] = Double.parseDouble(stk.nextToken());
                sumScore += stuScoreArray[j];
            }
            avgScore = sumScore / N;
            double overAvgStu = 0;
            for (double stuScore : stuScoreArray) {
                if (stuScore > avgScore) {
                    overAvgStu++;
                }
            }
            avgRatio[i] = overAvgStu / (double) N * 100;
        }

        for (double overAvgPercent : avgRatio) {
            bw.write(String.format("%.3f", overAvgPercent) + "%\n");
        }

        bw.flush();
        bw.close();
    }
}
