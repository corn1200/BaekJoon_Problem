package BruteForce;

import java.io.*;

public class FilmDirectorShum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int result = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (String.valueOf(i).contains("666")) {
                count++;
            }
            if (count == N) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
