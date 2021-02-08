package ProblemString;

import java.io.*;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int second = 0;
        char[] wordCharArr = br.readLine().toCharArray();
        br.close();
        for (char word : wordCharArr) {
            switch (word) {
                case 'A':
                case 'B':
                case 'C':
                    second += 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    second += 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    second += 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    second += 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    second += 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    second += 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    second += 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    second += 9;
                    break;
            }
        }

        bw.write(String.valueOf(second + wordCharArr.length));
        bw.flush();
        bw.close();
    }
}
