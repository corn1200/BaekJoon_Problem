package ProblemBasicMath2;

import java.io.*;

public class TaxiGeometry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double R = Double.parseDouble(br.readLine());
        br.close();

        bw.write(String.format("%.6f", R * R * Math.PI) + "\n");
        bw.write(String.format("%.6f", R * R * 2.0));
        bw.flush();
        bw.close();
    }
}
