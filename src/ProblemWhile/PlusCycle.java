package ProblemWhile;

import java.io.*;

public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cycle = 0;
        final int num = Integer.parseInt(br.readLine());
        br.close();

        int numsCopy = num;

        while (numsCopy != num || cycle < 1) {
            cycle++;
            if (numsCopy < 10) {
                numsCopy = makeNewNumber(numsCopy, numsCopy);
                continue;
            }
            int ten = getTensDigit(numsCopy);
            int one = getOnesDigit(numsCopy, ten);
            int newNum = ten + one;
            if (newNum < 10) {
                numsCopy = makeNewNumber(one, newNum);
                continue;
            }
            int newNumsTen = getTensDigit(newNum);
            int newNumsOne = getOnesDigit(newNum, newNumsTen);
            numsCopy = makeNewNumber(one, newNumsOne);
        }

        bw.write(Integer.toString(cycle));

        bw.flush();
        bw.close();
    }

    public static int makeNewNumber(int right1, int right2) {
        return (right1 * 10) + right2;
    }

    public static int getTensDigit(int num) {
        return num / 10;
    }

    public static int getOnesDigit(int num, int ten) {
        return num - (ten * 10);
    }
}
