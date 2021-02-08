package ProblemString;

import java.io.*;
import java.util.StringTokenizer;

public class NumberOfWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer newString = new StringTokenizer(br.readLine());
        br.close();

        bw.write(String.valueOf(newString.countTokens()));
        bw.flush();
        bw.close();
    }
}
