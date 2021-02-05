package ProblemOneDimenArray;

import java.io.*;

public class OxQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrayCount = Integer.parseInt(br.readLine());
        String[] testCaseArray = new String[arrayCount];

        for (int i = 0; i < testCaseArray.length; i++) {
            testCaseArray[i] = br.readLine();
        }
        br.close();

        for (String testCase : testCaseArray) {
            int totalScore = 0;
            int streakScore = 1;
            char[] charAtCase = testCase.toCharArray();
            for (char charOfCase : charAtCase) {
                switch (charOfCase) {
                    case 'O':
                        totalScore += streakScore++;
                        break;
                    case 'X':
                        streakScore = 1;
                        break;
                }
            }
            bw.write(totalScore + "\n");
        }
        bw.flush();
        bw.close();
    }
}
