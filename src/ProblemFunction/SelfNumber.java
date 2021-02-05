package ProblemFunction;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class SelfNumber {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int limit = 10000;

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= limit; i++) {
            list.addLast(i);
        }

        while (list.size() > 0) {
            int removeNum = list.removeFirst();
            bw.write(removeNum + "\n");
            searchSelfNum(removeNum, list);
        }

        bw.flush();
        bw.close();
    }

    public static void searchSelfNum(int num, LinkedList list) {
        String numString = String.valueOf(num);
        char[] numCharArr = numString.toCharArray();
        int newNum = Integer.parseInt(numString) + charArrToInt(numCharArr);
        if (list.contains(newNum)) {
            list.remove(list.indexOf(newNum));
            searchSelfNum(newNum, list);
        }
    }

    public static int charArrToInt(char[] charArr) {
        int numSum = 0;
        for (char num : charArr) {
            numSum += Character.getNumericValue(num);
        }

        return numSum;
    }
}
