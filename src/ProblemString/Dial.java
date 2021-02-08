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
            second += dialNum(word);
        }

        bw.write(String.valueOf(second + wordCharArr.length));
        bw.flush();
        bw.close();
    }

    public static int dialNum(char alphabet) {
        switch (alphabet) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
        }
        return 0;
    }
}
