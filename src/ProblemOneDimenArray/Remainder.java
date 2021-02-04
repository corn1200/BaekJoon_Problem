package ProblemOneDimenArray;

import java.io.*;
import java.util.HashSet;

public class Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> remainder = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            remainder.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();

        bw.write(Integer.toString(remainder.size()));

        bw.flush();
        bw.close();
    }
}
