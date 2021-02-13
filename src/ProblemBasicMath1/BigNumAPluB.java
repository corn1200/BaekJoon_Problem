package ProblemBasicMath1;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNumAPluB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        br.close();
        BigInteger A = new BigInteger(stk.nextToken());
        BigInteger B = new BigInteger(stk.nextToken());

        bw.write(String.valueOf(A.add(B)));
        bw.flush();
        bw.close();
    }
}
