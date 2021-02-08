package ProblemString;

import java.io.*;
import java.util.StringTokenizer;

public class Constant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        br.close();

        StringBuffer number1 = new StringBuffer();
        StringBuffer number2 = new StringBuffer();
        number1.append(stk.nextToken());
        number2.append(stk.nextToken());

        int reverseNum1 = Integer.parseInt(
                String.valueOf(number1.reverse()));
        int reverseNum2 = Integer.parseInt(
                String.valueOf(number2.reverse()));

        if (reverseNum1 > reverseNum2) {
            bw.write(String.valueOf(reverseNum1));
        } else {
            bw.write(String.valueOf(reverseNum2));
        }
        bw.flush();
        bw.close();
    }
}
