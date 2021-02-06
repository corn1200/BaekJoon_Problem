package ProblemString;

import java.io.*;

public class AsciiCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char string = br.readLine().toCharArray()[0];
        br.close();
        int asciiCode = string;

        bw.write(String.valueOf(asciiCode));
        bw.flush();
        bw.close();
    }
}
