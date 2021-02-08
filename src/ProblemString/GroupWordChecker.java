package ProblemString;

import java.io.*;
import java.util.HashSet;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int groupWordsCount = 0;
        rootLoop:
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            char[] wordCharArr = word.toCharArray();
            char bufferAlp = '0';
            HashSet<Character> alpSet = new HashSet<>();
            for (char wordChar : wordCharArr) {
                char tempAlp = bufferAlp;
                bufferAlp = wordChar;
                if (tempAlp != bufferAlp) {
                    if (alpSet.contains(wordChar)) {
                        continue rootLoop;
                    }
                    alpSet.add(wordChar);
                }
            }
            groupWordsCount++;
        }
        br.close();

        bw.write(String.valueOf(groupWordsCount));
        bw.flush();
        bw.close();
    }
}
