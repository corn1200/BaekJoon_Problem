package ProblemString;

import java.io.*;

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char[] alphabetArr = {'a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char alphabet : alphabetArr) {
            bw.write(S.indexOf(alphabet) + " ");
        }

        bw.flush();
        bw.close();
    }
}
