package ProblemOneDimenArray;

import java.io.*;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double highGrade = 0;
        double newSumGrade = 0;
        double newAvgGrade;
        int subject = Integer.parseInt(br.readLine());
        double[] grade = new double[subject];

        StringTokenizer stk = new StringTokenizer(br.readLine());

        for (int i = 0; stk.hasMoreTokens(); i++) {
            grade[i] = Integer.parseInt(stk.nextToken());
            highGrade = grade[i] > highGrade ? grade[i] : highGrade;
        }

        for (double subjectGrade : grade) {
            newSumGrade += subjectGrade / highGrade * 100;
        }

        newAvgGrade = newSumGrade / subject;

        bw.write(String.valueOf(newAvgGrade));

        bw.flush();
        bw.close();
    }
}
