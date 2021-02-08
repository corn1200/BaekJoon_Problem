package ProblemString;

import java.io.*;
import java.util.StringTokenizer;

public class StringRepetition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int repetition = Integer.parseInt(stk.nextToken());
            String repetitionWord = stk.nextToken();
            char[] wordCharArr = repetitionWord.toCharArray();
            for (char word : wordCharArr) {
                for (int j = 0; j < repetition; j++) {
                    bw.write(String.valueOf(word));
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
