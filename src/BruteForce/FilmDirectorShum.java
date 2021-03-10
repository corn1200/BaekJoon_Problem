package BruteForce;

import java.io.*;

public class FilmDirectorShum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write((N - 1 == 0 ? "" : N - 1) + "666");
        bw.flush();
        bw.close();
    }
}
